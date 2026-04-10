package ru.netology.page;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    public VerificationPage() {
        $("[data-test-id=code] input").shouldBe(visible);
    }

    public void validVerify(String verificationCode) {
        $("[data-test-id=code] input").setValue(verificationCode);
        $("[data-test-id=action-verify]").click();
        new DashboardPage();
    }
}