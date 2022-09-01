package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: cz  reason: default package */
/* loaded from: classes.dex */
public final class cz {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static void c(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof oj) {
                editorInfo.hintText = ((oj) parent).a();
                return;
            }
        }
    }

    public static final int d(int i, ByteBuffer byteBuffer) {
        if (f(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    public static final short e(int i, ByteBuffer byteBuffer) {
        if (f(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean f(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
