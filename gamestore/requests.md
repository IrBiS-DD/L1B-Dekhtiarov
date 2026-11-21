# Запити

Перелік ігор:

```bash
curl http://localhost:8080/api/games
```

Фільтр за жанром:

```bash
curl "http://localhost:8080/api/games?genre=RPG"
```

Одна гра:

```bash
curl http://localhost:8080/api/games/1
```

Створити гру (201):

```bash
curl -i -X POST http://localhost:8080/api/games \
  -H "Content-Type: application/json" \
  -d '{"title":"Celeste","developer":"Maddy Makes Games","price":199.00,"year":2018,"genre":"Платформер","coverUrl":"/covers/celeste.jpg","description":"Платформер про підйом на гору."}'
```

Оновити гру (200, або 404 якщо немає):

```bash
curl -i -X PUT http://localhost:8080/api/games/1 \
  -H "Content-Type: application/json" \
  -d '{"title":"The Witcher 3","developer":"CD Projekt Red","price":399.00,"year":2015,"genre":"RPG","coverUrl":"/covers/witcher3.jpg","description":"Оновлений опис."}'
```

Видалити гру (204, або 404 якщо немає):

```bash
curl -i -X DELETE http://localhost:8080/api/games/2
```

Неіснуюча гра (404):

```bash
curl -i http://localhost:8080/api/games/999
```
