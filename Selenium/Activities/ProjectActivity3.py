from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity3():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    course = driver.find_element(By.XPATH,".//div[contains(@id,'uagb-infobox-f')]/div[1]/div[1]/div[1]/div[2]/h3[1]").text
    assert course == "Actionable Training"

    print("Validated the first info box successfully")

projectActivity3()

