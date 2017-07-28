# Country State Provide Library for Java

This library is intended to provide the states list of a given country.
I used this for my private project and generously borrowed the country state list 
from [1]

[1]. https://github.com/substack/provinces/blob/master/provinces.json

## Getting Started

See the following code block to acquire the list of states of a country.

```
List<Country> list = CountryStateProvider.getStates("US");
```
Country object contains the following.
```
Country.name        - full name of the province or state
Country.country     - country abbreviation
Country.shortName   - optional 2 or 3 character short name
Country.alt         - optional array of additional names and abbreviations
Country.region      - optional region of a country (for example: "Wales")
Country.englishName - optional english name of a country (for example: "Chongqing" in china (CN))
```

Supported country List.

1. united states (US)
2. united kingdom (GB)
3. canada (CA)
4. mexico (MX)
5. australia (AU)
6. china (CN)
7. germany (DE)
8. belgium (BE)
9. netherlands (NL)
10. denmark (DK)
11. Turkey (TR)
12. Indonesia (ID)
13. Jordan (JO)
14. India (IN)
15. Cambodia (KH)
16. Ethiopia (ET)
17. Peru (PE)
18. Cuba (CU)
19. Argentina (AR)
20. Chile (CL)
21. Bolivia (BO)
22. Spain (ES)
23. Bangladesh (BD)
24. Pakistan (PK)
25. Nigeria (NG)
26. Japan (JP)
27. austria (AT)
28. brazil (BR)
29. Philippines (PH)
30. Vietnam (VN)
31. Costa Rica (CR)


### Prerequisites

The library requires JDK 8.


## Authors

* **Aruna Karunarathna** - *Initial work* - [arunasujith](https://github.com/arunasujith)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
