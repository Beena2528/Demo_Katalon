$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Products.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart products",
  "description": "As user I want to add products in cart on https://cms.demo.katalon.com website",
  "id": "add-to-cart-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6381923400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should able be able to add products in to the cart",
  "description": "",
  "id": "add-to-cart-products;user-should-able-be-able-to-add-products-in-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on homePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add four random items in my card",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on view products",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify that all four product successfully added in card",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I search for lowest price item",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I remove lowest price item from the list",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify that all Three product successfully added in card",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 103339400,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iAddFourRandomItemsInMyCard()"
});
formatter.result({
  "duration": 1015344900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iClickInViewProducts()"
});
formatter.result({
  "duration": 1703661000,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iVerifyThatAllFourProductSuccessfullyAddedInCard()"
});
formatter.result({
  "duration": 66938500,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iSearchForLowestItem()"
});
formatter.result({
  "duration": 70900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iRemoveLowestPriceItemFromTheList()"
});
formatter.result({
  "duration": 137884300,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepdefs.iVerifyThatAllThreeProductSuccessfullyAddedInCard()"
});
formatter.result({
  "duration": 2071356700,
  "status": "passed"
});
formatter.after({
  "duration": 988488800,
  "status": "passed"
});
});