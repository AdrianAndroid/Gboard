package defpackage;

import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.search.EmojiSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.standard.EmojiPickerKeyboard;
import com.google.android.apps.inputmethod.libs.search.emoji.standard.EmojiPickerTabletKeyboard;
import j$.util.function.BooleanSupplier;

/* compiled from: PG */
/* renamed from: eav  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eav implements BooleanSupplier {
    public final /* synthetic */ LifecycleKeyboard a;
    private final /* synthetic */ int b;

    public /* synthetic */ eav(EmojiSearchResultKeyboard emojiSearchResultKeyboard, int i) {
        this.b = i;
        this.a = emojiSearchResultKeyboard;
    }

    public /* synthetic */ eav(EmojiPickerKeyboard emojiPickerKeyboard, int i) {
        this.b = i;
        this.a = emojiPickerKeyboard;
    }

    public /* synthetic */ eav(EmojiPickerTabletKeyboard emojiPickerTabletKeyboard, int i) {
        this.b = i;
        this.a = emojiPickerTabletKeyboard;
    }

    @Override // j$.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        int i = this.b;
        if (i == 0 || i != 1) {
        }
        return this.a.C;
    }
}
