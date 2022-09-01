package defpackage;

import com.google.android.apps.inputmethod.libs.search.emoticon.EmoticonKeyboardTablet;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;

/* compiled from: PG */
/* renamed from: ebj  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ebj implements hiu {
    private final /* synthetic */ int i;
    public static final /* synthetic */ ebj h = new ebj(8);
    public static final /* synthetic */ ebj g = new ebj(7);
    public static final /* synthetic */ ebj f = new ebj(6);
    public static final /* synthetic */ ebj e = new ebj(5);
    public static final /* synthetic */ ebj d = new ebj(4);
    public static final /* synthetic */ ebj c = new ebj(3);
    public static final /* synthetic */ ebj b = new ebj(1);
    public static final /* synthetic */ ebj a = new ebj(0);

    public /* synthetic */ ebj(int i) {
        this.i = i;
    }

    @Override // defpackage.hiu
    public final void a(Object obj) {
        switch (this.i) {
            case 0:
                Throwable th = (Throwable) obj;
                ((ltd) ((ltd) EmoticonKeyboardTablet.a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "lambda$setEmoticons$4", 682, "EmoticonKeyboardTablet.java")).t("setEmoticons(): Recent emoticon can't be retrieved. ");
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((ltd) ((ltd) EmoticonKeyboardTablet.a.c()).k("com/google/android/apps/inputmethod/libs/search/emoticon/EmoticonKeyboardTablet", "lambda$onActivate$1", 340, "EmoticonKeyboardTablet.java")).t("setEmoticons(): Recent emoticon can't be retrieved. ");
                return;
            case 2:
                ((Integer) obj).intValue();
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) UniversalMediaKeyboardTablet.a.c()).i((Throwable) obj)).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "lambda$displayHeaderElement$3", (char) 583, "UniversalMediaKeyboardTablet.java")).t("Failed to get packs.");
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) hat.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/data/DefaultStickyPreferencesProtoProvider", "lambda$writeStickyVariantPreferencesToDisk$3", (char) 132, "DefaultStickyPreferencesProtoProvider.java")).t("Failed to write sticky preferences to disk");
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) hbc.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/data/GboardBundledEmojiListLoader", "lambda$flagsUpdated$0", '`', "GboardBundledEmojiListLoader.java")).t("Failed to clear renderable emoji cache");
                return;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ((ltd) ((ltd) hbc.a.d()).k("com/google/android/libraries/inputmethod/emoji/data/GboardBundledEmojiListLoader", "lambda$flagsUpdated$1", 105, "GboardBundledEmojiListLoader.java")).t("Failed to clear renderable emoji cache");
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) hci.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$getBodyAdapter$7", (char) 848, "EmojiPickerController.java")).t("Emoji picker data loading failed");
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) hci.a.d()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "lambda$getBodyAdapter$8", (char) 852, "EmojiPickerController.java")).t("Emoji picker data loading is cancelled");
                return;
            case 9:
                ((hwu) obj).e();
                return;
            default:
                ((hwu) obj).b();
                return;
        }
    }
}
