# FatnessChecker
This project is sample code of dependency injection for Java.

この記事は [Java Advent Calendar 2018](https://qiita.com/advent-calendar/2018/java) の12日目の記事のための、サンプルプロジェクトです。



# 肥満度判定

肥満度判定という題材で解説します。（少々茶番にお付き合いください）

:man: 俺って太ってるのかな？そうだ！肥満度判定会社に検査を依頼してみよう！

数時間後

:person_frowning: ようこそ、肥満度判定会社へ。さっそくですが、身長と体重を伺ってもよろしいでしょうか？

:man: えっと、身長は170cm、体重は70kgです。

:person_frowning: かしこまりました。少々お待ちくさい。弊社の最新型のロボットでBMIを計算いたします。

:robot: 計算シマス・・・70kg÷1.70mデ、BMIハ **41.18** デス！

:person_frowning: BMIが41.18ですと・・・40以上なので**4度肥満**ですね。

:man: ええ！そんな！

数時間後

:man: 俺が肥満なんて絶対におかしい。あのロボット、バグってない？

:older_man: そこの人、肥満度判定でお困りですかな？良ければ話を聞かせてくだされ。

:man: ええ、実はかくかくしかじかで・・・

数日後

:information_desk_person: ようこそ、肥満度判定会社へ。さっそくですが、身長と体重を伺ってもよろしいでしょうか？

:man: 身長は170cm、体重は70kgです。

:information_desk_person: 少々お待ちくさい・・・最新ロボットでBMIを計算いたします。

:man: ちょっと待って！BMIの計算はこの人にやってもらいたいんだ。

:older_man: ほっほっほ、この場合、70kg÷1.70m÷1.70mで、BMIは**24.22**ですな。

:information_desk_person: かしこまりました。BMIが24.22ですと・・・18.5以上25未満なので**普通体重**ですね。

:man: やった！（肥満までギリギリじゃねーか！）



# 各自の役割

このストーリーに登場した人物は以下の通りです。

- :man: は自分の肥満度が知りたい人です。利用者ということで、`User`と呼ぶことにします。
- :person_frowning: は :robot: を使って肥満度を判定する人です。  `FatnessChecker` と呼ぶことにします。
- :robot: はBMIを計算するロボットです。まだ試作品でバグがあります。 `BmiRobot` と呼ぶことにします。
- :older_man: はBMIを計算する達人です。絶対に計算を間違えません。 `BmiMaster` と呼ぶことにします。
- :information_desk_person: は :older_man: を使って肥満度を判定する人です。:person_frowning: と同一人物ですが、説明のため区別し、 `FatnessCheckerDi` と呼ぶことにします。



# 今回の事例の問題

:robot:` BmiRobot` はBMIの計算を間違えてしまいました。どうやらバグがあるようです。

この間違った計算結果をもとに、:person_frowning: `FatnessChecker` が肥満度判定を行ったため、判定結果も間違ったものになってしましました。

つまり、:person_frowning: `FatnessChecker` が :robot: `BmiRobot` という信頼性の低いロボットに依存していたことが問題と言えます。



# DIという解決策

:man: `User`は、自分が信頼できる人物 :older_man:`BmiMaster` にBMIの計算をやってもらう条件で、:information_desk_person: `FatnessCheckerDi` に肥満度判定を依頼しました。

これによって、:information_desk_person: `FatnessCheckerDi` の判定結果は、:older_man: `BmiMaster` という信頼性の高い人物に依存するようになります。

これが**DI**（Dependency Injection、依存性の注入）です！つまり、

### :man: `User` は、:information_desk_person: `FatnessCheckerDi` に対して、 :older_man: `BmiMaster`  を注入したのです！（意味深）

