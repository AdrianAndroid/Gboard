package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: adz  reason: default package */
/* loaded from: classes.dex */
public final class adz extends InputConnectionWrapper {
    private final TextView a;

    public adz(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = textView;
        adq b = adq.b();
        if (!b.e() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        adm admVar = b.g;
        Bundle bundle = editorInfo.extras;
        ajj ajjVar = (ajj) ((adl) admVar).a.d;
        int a = ajjVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ajjVar.b.getInt(a + ajjVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return bek.k(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return bek.k(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
