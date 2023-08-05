from selenium import webdriver
from selenium.webdriver.common.by import By

def projectActivity4():
    driver = webdriver.Chrome()
    driver.get("https://alchemy.hguy.co/lms/")
    heading = driver.find_element(By.XPATH,".//div[contains(@class,'ld-')]/div[2]/article[1]/div[2]/h3[1]").text
    assert heading == "Email Marketing Strategies"
    print("validated the 2nd popular course heading successfully")

projectActivity4()
