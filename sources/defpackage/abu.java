package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: abu  reason: default package */
/* loaded from: classes.dex */
public final class abu {
    private static final String[] a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static boolean b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    public static String[] c(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : a;
        } else if (editorInfo.extras == null) {
            return a;
        } else {
            String[] stringArray = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            if (stringArray == null) {
                stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            }
            return stringArray != null ? stringArray : a;
        }
    }
}
