package guru.qa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {

        SelenideElement
                monthInput = $(".react-datepicker__month-select"),
                yearInput = $(".react-datepicker__year-select"),
                dayInput = $(".react-datepicker__day--030:not(.react-datepicker__" + day +
                        "--outside-month)");


        monthInput.selectOption(month);
        yearInput.selectOption(year);
        dayInput.click();
    }
}