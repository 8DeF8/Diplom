package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static ru.iteco.fmhandroid.ui.data.DataHelper.childAtPosition;

public class NewsElement {
    private final ViewInteraction newsSectionTitle = onView(withText("News"));
    private final ViewInteraction linearLayoutPanel = onView(withId(R.id.container_list_news_include));
    private final ViewInteraction sortNewsButton = onView(withId(R.id.sort_news_material_button));
    private final ViewInteraction filterNewsButton = onView(withId(R.id.filter_news_material_button));
    private final ViewInteraction editNewsButton = onView(withId(R.id.edit_news_material_button));
    private final ViewInteraction listOfNews = onView(withId(R.id.news_list_recycler_view));
    private final ViewInteraction createTitle = onView(withId(R.id.custom_app_bar_title_text_view));
    private final ViewInteraction newsTitle = onView(withId(R.id.custom_app_bar_sub_title_text_view));

    private final ViewInteraction category = onView(withId(R.id.news_item_category_text_auto_complete_text_view));
    private final ViewInteraction header = onView(withId(R.id.news_item_title_text_input_edit_text));
    private final ViewInteraction publicationDate = onView(withId(R.id.news_item_publish_date_text_input_edit_text));
    private final ViewInteraction time = onView(withId(R.id.news_item_publish_time_text_input_edit_text));
    private final ViewInteraction description = onView(withId(R.id.news_item_description_text_input_edit_text));
    private final ViewInteraction switcher = onView(withId(R.id.switcher));

    private final ViewInteraction saveButton = onView(withId(R.id.save_button));
    private final ViewInteraction cancelButton = onView(withId(R.id.cancel_button));
    private final ViewInteraction okExitButton = onView(
            allOf(withId(android.R.id.button1), withText("OK"),
                    childAtPosition(
                            withClassName(is("android.widget.LinearLayout")), childAtPosition(
                                    withClassName(is("android.widget.LinearLayout")), withClassName(is("android.widget.ScrollView")),
                                    0),
                            3)));

    public ViewInteraction getNewsSectionTitle() {
        return newsSectionTitle;
    }

    public ViewInteraction getSortNewsButton() {
        return sortNewsButton;
    }

    public ViewInteraction getFilterNewsButton() {
        return filterNewsButton;
    }

    public ViewInteraction getEditNewsButton() {
        return editNewsButton;
    }

    public ViewInteraction getListOfNews() {
        return listOfNews;
    }

    public ViewInteraction getCreateTitle() {
        return createTitle;
    }

    public ViewInteraction getLinearLayoutPanel() {
        return linearLayoutPanel;
    }

    public ViewInteraction getNewsTitle() {
        return newsTitle;
    }

    public ViewInteraction getCategory() {
        return category;
    }

    public ViewInteraction getHeader() {
        return header;
    }

    public ViewInteraction getPublicationDate() {
        return publicationDate;
    }

    public ViewInteraction getTime() {
        return time;
    }

    public ViewInteraction getDescription() {
        return description;
    }

    public ViewInteraction getSwitcher() {
        return switcher;
    }

    public ViewInteraction getSaveButton() {
        return saveButton;
    }

    public ViewInteraction getCancelButton() {
        return cancelButton;
    }

    public ViewInteraction getOkExitButton() {
        return okExitButton;
    }

}