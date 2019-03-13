package ne.application.com.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import ne.application.com.myapplication.models.DataGson;
import ne.application.com.myapplication.models.Section;

public class MainActivity extends AppCompatActivity {

    DataGson dataGson;
    FrameLayout frameLayout;
    CardView card;
    LinearLayout mHeaderLinearLayout, mMiddleImageLinearLayout, mMiddleDescriptionLayout, mSectionInfoLinearLayout, mFooterButtonLinearLayout;
    LinearLayout childLinearLayout;
    TextView walking, walkingValueType, steps, stepValueType;
    ImageView middleImage;
    TextView middleImageDescription;
    TextView time, km, kmph;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.r1);
        createFrameView();
        readJson();
    }

    private void createFrameView() {

        frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(16, 16, 16, 16);
        frameLayout.setLayoutParams(params);
        createCardView();
        createButtonLayout();
        mFooterButtonLinearLayout.setElevation(9);
        frameLayout.addView(card);
        frameLayout.addView(mFooterButtonLinearLayout);
        mRelativeLayout.addView(frameLayout);
    }

    private void createButtonLayout() {
        mFooterButtonLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        params2.setMargins(16, 8, 16, 8);
        mFooterButtonLinearLayout.setLayoutParams(params);
        ImageButton edit = new ImageButton(this);
        edit.setBackground(getResources().getDrawable(R.drawable.round_button));
        edit.setImageResource(R.drawable.ic_edit_black_24dp);
        edit.setLayoutParams(params2);
        // edit.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        ImageButton share = new ImageButton(this);
        share.setBackground(getResources().getDrawable(R.drawable.round_button));
        share.setImageResource(R.drawable.ic_share_black_24dp);
        share.setLayoutParams(params2);
        // share.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        mFooterButtonLinearLayout.addView(edit);
        mFooterButtonLinearLayout.addView(share);
        mFooterButtonLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        mFooterButtonLinearLayout.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
    }

    private void createCardView() {
        card = new CardView(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        params.setMargins(16, 16, 16, 70);
        card.setLayoutParams(params);
        card.setRadius(14);
        card.setContentPadding(15, 15, 15, 15);
        card.setCardBackgroundColor(Color.parseColor("#FFC6D6C3"));
        card.setMaxCardElevation(15);
        card.setCardElevation(9);
        createcardChildLinearLayout();
        card.addView(childLinearLayout);
    }

    private void createcardChildLinearLayout() {
        childLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params.setMargins(10, 10, 10, 10);
        childLinearLayout.setOrientation(LinearLayout.VERTICAL);
        childLinearLayout.setLayoutParams(params);
        createSectionHeader();
        createSectionMiddleImage();
        createSectionMiddleImageDescription();
        createSectionInfo();
        createSectionFoooterButton();
        childLinearLayout.addView(mHeaderLinearLayout);
        childLinearLayout.addView(mMiddleImageLinearLayout);
        childLinearLayout.addView(mSectionInfoLinearLayout);
        childLinearLayout.addView(mMiddleDescriptionLayout);
        childLinearLayout.addView(mFooterButtonLinearLayout);
    }

    private void createSectionHeader() {
        mHeaderLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(10, 10, 10, 10);
        mHeaderLinearLayout.setLayoutParams(params);
        mHeaderLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        mHeaderLinearLayout.setWeightSum(2f);

        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1f
        );
        LinearLayout walkingLL = new LinearLayout(this);

        walkingLL.setOrientation(LinearLayout.VERTICAL);
        walkingLL.setLayoutParams(params1);
        walking = new TextView(this);
        walking.setGravity(Gravity.START);
        walkingValueType = new TextView(this);
        walkingValueType.setGravity(Gravity.START);
        walkingValueType.setText("Walking");
        walkingLL.addView(walking);
        walkingLL.addView(walkingValueType);

        LinearLayout stepsLL = new LinearLayout(this);
        stepsLL.setOrientation(LinearLayout.VERTICAL);
        stepsLL.setLayoutParams(params1);
        steps = new TextView(this);
        steps.setGravity(Gravity.END);
        stepValueType = new TextView(this);
        stepValueType.setGravity(Gravity.END);
        stepValueType.setText("Steps");
        stepsLL.addView(steps);
        stepsLL.addView(stepValueType);
        // walking.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));

        // steps.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));

        mHeaderLinearLayout.addView(walkingLL);
        mHeaderLinearLayout.addView(stepsLL);
    }

    private void createSectionMiddleImage() {

        mMiddleImageLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(10, 10, 10, 10);
        mMiddleImageLinearLayout.setLayoutParams(params);
        middleImage = new ImageView(this);
        middleImage.setLayoutParams(params);
        middleImage.setImageResource(R.drawable.ic_launcher_background);
        mMiddleImageLinearLayout.addView(middleImage);
    }

    private void createSectionMiddleImageDescription() {
        mSectionInfoLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(10, 10, 10, 10);
        mSectionInfoLinearLayout.setLayoutParams(params);
        middleImageDescription = new TextView(this);
        middleImageDescription.setText("39 kal");
        middleImageDescription.setLayoutParams(params);
        middleImageDescription.setGravity(Gravity.CENTER);
        mSectionInfoLinearLayout.addView(middleImageDescription);
    }

    private void createSectionInfo() {
        mMiddleDescriptionLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(10, 10, 10, 40);
        mMiddleDescriptionLayout.setLayoutParams(params);
        mMiddleDescriptionLayout.setWeightSum(3f);
        mMiddleDescriptionLayout.setGravity(Gravity.CENTER);
        createSectionInfoViews(mMiddleDescriptionLayout);
    }

    private void createSectionInfoViews(LinearLayout mMiddleDescriptionLayout) {

        mMiddleDescriptionLayout.setOrientation(LinearLayout.HORIZONTAL);


        LinearLayout timeLinearLayout = new LinearLayout(this);
        timeLinearLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        createTimeView(timeLinearLayout);

        LinearLayout kmLinearLayout = new LinearLayout(this);
        kmLinearLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        createKiloView(kmLinearLayout);

        LinearLayout speedLinearLayout = new LinearLayout(this);
        speedLinearLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 1f));
        createSpeedView(speedLinearLayout);

        mMiddleDescriptionLayout.addView(timeLinearLayout);
        mMiddleDescriptionLayout.addView(kmLinearLayout);
        mMiddleDescriptionLayout.addView(speedLinearLayout);
    }

    private void createSpeedView(LinearLayout speedLinearLayout) {
        speedLinearLayout.setOrientation(LinearLayout.VERTICAL);
        ImageView speedImage = new ImageView(this);
        speedImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_location_on_black_24dp));
        kmph = new TextView(this);
        ;
        kmph.setText("2.636 kmph");
        kmph.setGravity(Gravity.CENTER);
        speedLinearLayout.addView(speedImage);
        speedLinearLayout.addView(kmph);
    }

    private void createKiloView(LinearLayout kmLinearLayout) {
        kmLinearLayout.setOrientation(LinearLayout.VERTICAL);
        ImageView kiloImage = new ImageView(this);
        kiloImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_location_on_black_24dp));
        km = new TextView(this);
        ;
        km.setText("2.61 km");
        km.setGravity(Gravity.CENTER);
        kmLinearLayout.addView(kiloImage);
        kmLinearLayout.addView(km);
    }

    private void createTimeView(LinearLayout timeLinearLayout) {
        timeLinearLayout.setOrientation(LinearLayout.VERTICAL);
        ImageView timeImage = new ImageView(this);
        timeImage.setImageDrawable(getResources().getDrawable(R.drawable.ic_time_black_24dp));
        time = new TextView(this);
        ;
        time.setText("14 min");
        time.setGravity(Gravity.CENTER);
        timeLinearLayout.addView(timeImage);
        timeLinearLayout.addView(time);
    }

    private void createSectionFoooterButton() {
        mFooterButtonLinearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        params.setMargins(10, 10, 10, 10);
        mFooterButtonLinearLayout.setLayoutParams(params);
    }


    public void readJson() {
        InputStream is = getResources().openRawResource(R.raw.document);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonString = writer.toString();
        Gson g = new Gson();
        dataGson = g.fromJson(jsonString, DataGson.class);

        fillCardValues(dataGson);
    }

    private void fillCardValues(DataGson dataGson) {

        for (int i=0; i<dataGson.getSections().size();i++){

            switch (dataGson.getSections().get(i).getSectionId()){

                case "section_header_1" :
                    fillDetailHeader(dataGson.getSections().get(i));
                    break;
                case "section_middle_image" :
                    fillMiddleImage(dataGson.getSections().get(i));
                    break;
                case "section_middle_description" :
                    fillMiddleDescription(dataGson.getSections().get(i));
                    break;
                case "section_info" :
                    fillSectionInfo(dataGson.getSections().get(i));
                    break;
                case "section_footer_button" :
                    fillFooterButton(dataGson.getSections().get(i));
                    break;
            }

        }
    }

    private void fillFooterButton(Section section) {

    }

    private void fillSectionInfo(Section section) {
        time.setText(section.getElements().get(0).getData().get(1).getValueint().toString());
        km.setText(section.getElements().get(1).getData().get(1).getValueint().toString());
        kmph.setText(section.getElements().get(2).getData().get(1).getValueint().toString());
    }

    private void fillMiddleDescription(Section section) {
        middleImageDescription.setText(section.getElements().get(0).getData().get(1).getValueint().toString()+"  cal");
    }

    private void fillMiddleImage(Section section) {
    }

    private void fillDetailHeader(Section section) {
        walking.setText(section.getElements().get(0).getData().get(0).getValueint().toString());
        walkingValueType.setText(section.getElements().get(2).getData().get(0).getValueint().toString());
        steps.setText(section.getElements().get(3).getData().get(0).getValueint().toString());
        stepValueType.setText(section.getElements().get(1).getData().get(1).getValueint().toString());
    }

}
