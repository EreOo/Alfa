Meta:
@category basic

Narrative:
As a user
I want go to yandex market. Set some filters.
Choose first product from filtered list.
Click on it and page with this product will be displayed.

Scenario: User click on the product and see correct page.
Given User open yandex market and select filters (<device>, <brand>, <min_price>, <max_price>)
When User click on first product
Then User see correct page

Examples:
|device|brand|min_price|max_price|
|Мобильные телефоны|Samsung|40000||
|Наушники и Bluetooth-гарнитуры|Beats|17000|25000|





