package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: uu  reason: default package */
/* loaded from: classes2.dex */
public final class uu {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        aeg[] aegVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!d(selectionStart, selectionEnd) && (aegVarArr = (aeg[]) editable.getSpans(selectionStart, selectionEnd, aeg.class)) != null && (r2 = aegVarArr.length) > 0) {
                for (aeg aegVar : aegVarArr) {
                    int spanStart = editable.getSpanStart(aegVar);
                    int spanEnd = editable.getSpanEnd(aegVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0042, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0070, code lost:
        if (r11 != false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    private static boolean d(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
