package dtlv.com.dtlv_application;

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Utilisateur on 11-04-16.
 */
public class Export_PDF extends Fragment {
    private View mRootView;
    private Button mSaveButton;
    private Button mOpenButton;
    private Button mSendButton;
    static private File myFile;

    private GestionPoint gestPts;
    private TextView test_score = null;
    private TextView test1_score = null;
    private TextView test2_score = null;
    private TextView test3_score = null;
    private TextView test4_score = null;
    private TextView test5_score = null;
    private TextView test6_score = null;
    private TextView test7_score = null;
    private TextView test8_score = null;
    private TextView test9_score = null;
  // private TextView test10_score = null;
    private TextView score = null;

    public Export_PDF() {
        // Required empty public constructor
        gestPts = Menu.gestPts;
    }
    private void createPdf() throws FileNotFoundException, DocumentException {
        File pdfFolder = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "DTLA");
        boolean success = true;
        if (!pdfFolder.exists()) {
            success = pdfFolder.mkdir();
        }
        if (success) {
            mSaveButton.setText(R.string.result_success);
            mOpenButton.setVisibility(View.VISIBLE);
            mSaveButton.setClickable(false);
        } else {
            mSaveButton.setText(R.string.result_failure);
        }

        //Create time stamp
        Date date = new Date() ;
        String timeStamp1 = new SimpleDateFormat("yyyy_MM_dd").format(date);
        String timeStamp2 = new SimpleDateFormat("HH").format(date);
        String timeStamp3 = new SimpleDateFormat("mm").format(date);

        this.myFile = new File(pdfFolder, "Patient_" +timeStamp1 + "_" + timeStamp2 + "h" + timeStamp3 + ".pdf");

        FileOutputStream output = new FileOutputStream(myFile);

        //Step 1
        Document document = new Document();

        //Step 2
        PdfWriter.getInstance(document, output);

        //Step 3
        document.open();

        //Step 4 Add content
        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
        Font title_font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 20);
        String tempo =  getResources().getString(R.string.result_pdf_title);
        Paragraph titre = new Paragraph(tempo, title_font);
        titre.setAlignment(Element.ALIGN_CENTER);
        document.add(titre);
        try {
            Drawable d = getResources().getDrawable(R.drawable.logo_dtla);
            BitmapDrawable bitDw = ((BitmapDrawable) d);
            Bitmap bmp = bitDw.getBitmap();
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            bmp.compress(Bitmap.CompressFormat.PNG,100, stream);
            Image image = Image.getInstance(stream.toByteArray());
            image.scaleAbsolute(150f, 150f);
            image.setAlignment(Image.MIDDLE);
            document.add(image);

        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        Drawable logo = getResources().getDrawable(R.drawable.logo_dtla);
        document.add(logo);*/
        document.add(new Paragraph("Date : " + timeStamp1 + "_" + timeStamp2 + "h" + timeStamp3 + "\n"));
        document.add(new Paragraph(test_score.getText().toString(), font));
        document.add(new Paragraph(test1_score.getText().toString(), font));
        document.add(new Paragraph(test2_score.getText().toString(), font));
        document.add(new Paragraph(test3_score.getText().toString(), font));
        document.add(new Paragraph(test4_score.getText().toString(), font));
        document.add(new Paragraph(test5_score.getText().toString(), font));
        document.add(new Paragraph(test6_score.getText().toString(), font));
        document.add(new Paragraph(test7_score.getText().toString(), font));
        document.add(new Paragraph(test8_score.getText().toString(), font));
        document.add(new Paragraph(test9_score.getText().toString(), font));
       // document.add(new Paragraph(test10_score.getText().toString(), font));
        document.add(new Paragraph(score.getText().toString(), font));

        //Step 5: Close the document
        document.close();

    }

    private void viewPdf(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(this.myFile), "application/pdf");
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }

    public static Export_PDF newInstance(){
        Export_PDF fragment = new Export_PDF();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.export_pdf, container, false);
        mSaveButton = (Button) mRootView.findViewById(R.id.createPdf);
        mOpenButton = (Button) mRootView.findViewById(R.id.openPdf);
        mSendButton = (Button) mRootView.findViewById(R.id.sendPdf);
        test_score = (TextView) mRootView.findViewById(R.id.test_score);
        test_score.setText("Affichage provisoire des résultats aux tests.");
        test1_score = (TextView) mRootView.findViewById(R.id.test1_score);
        test1_score.setText("Test 1 (Dénomination) : " + gestPts.getT1());
        test2_score = (TextView) mRootView.findViewById(R.id.test2_score);
        test2_score.setText("Test 2 (Répétition) : " + gestPts.getT2());
        test3_score = (TextView) mRootView.findViewById(R.id.test3_score);
        test3_score.setText("Test 3 (Fluence verbale) : " + gestPts.getT3());
        test4_score = (TextView) mRootView.findViewById(R.id.test4_score);
        test4_score.setText("Test 4 (Alpha-span) : " + gestPts.getT4());
        test5_score = (TextView) mRootView.findViewById(R.id.test5_score);
        test5_score.setText("Test 5 (Lecture) : " + gestPts.getT5());
        test6_score = (TextView) mRootView.findViewById(R.id.test6_score);
        test6_score.setText("Test 6 (Compréhension des phrases) : " + gestPts.getT6());
        test7_score = (TextView) mRootView.findViewById(R.id.test7_score);
        test7_score.setText("Test 7 (Dictée) : " + gestPts.getT7());
        test8_score = (TextView) mRootView.findViewById(R.id.test8_score);
        test8_score.setText("Test 8 (Écriture spontanée) : " + gestPts.getT8());
        test9_score = (TextView) mRootView.findViewById(R.id.test9_score);
        test9_score.setText("Test 9 (Compréhension sémantique) : " + gestPts.getT9());
     //   test10_score = (TextView) mRootView.findViewById(R.id.test10_score);
     //   test10_score.setText("Test 10 (Language spontané) : " + gestPts.getT10());
        score = (TextView) mRootView.findViewById(R.id.score);
        int scoretotal = gestPts.getT1() + gestPts.getT2() + gestPts.getT3() + gestPts.getT4() + gestPts.getT5() + gestPts.getT6() + gestPts.getT7() + gestPts.getT8() + gestPts.getT9();
        score.setText("Score global : " + scoretotal + "/100");


        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSaveButton.setText(R.string.result_processing);
                mSaveButton.setActivated(false);
                mRootView.refreshDrawableState();
                try {
                    createPdf();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
            }
        });
        mOpenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(myFile), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                try {
                    startActivity(intent);
                }
                catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    mOpenButton.setText(R.string.result_failure);
                    mOpenButton.setClickable(false);
                }
            }
        });

        return mRootView;
    }

}