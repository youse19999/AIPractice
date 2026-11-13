# libGDX Java 開発環境

Java 21 と libGDX 1.14.2 を使う、LWJGL3 デスクトップ向けの最小プロジェクトです。

## 起動

Java 21 以降をインストールした環境で、プロジェクトのルートから実行します。

- macOS / Linux: `./gradlew lwjgl3:run`
- Windows: `gradlew.bat lwjgl3:run`

初回はGradleと依存ライブラリをダウンロードします。デスクトップウィンドウが開き、暗い背景が表示されます。

## コードと素材

- ゲーム本体: `core/src/main/java/com/example/game/MyGdxGame.java`
- デスクトップ起動クラス: `lwjgl3/src/main/java/com/example/game/lwjgl3/Lwjgl3Launcher.java`
- 画像・音声など: `assets/`

IDEでは `settings.gradle` のあるフォルダーをGradleプロジェクトとして開いてください。
