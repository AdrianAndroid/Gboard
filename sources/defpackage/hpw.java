package defpackage;

import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;

/* compiled from: PG */
/* renamed from: hpw  reason: default package */
/* loaded from: classes.dex */
public final class hpw {
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/inputconnection/InputConnectionUtil");
    public static final gzy a = new gzy("InputConnection");

    public static ExtractedText a(InputConnection inputConnection, ExtractedTextRequest extractedTextRequest, int i) {
        a.b("getExtractedText(<request>, %d)", Integer.valueOf(i));
        return inputConnection.getExtractedText(extractedTextRequest, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hqk b(InputConnection inputConnection, int i, int i2, int i3) {
        try {
            a.d("getSurroundingText(%d, %d, %d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            SurroundingText surroundingText = inputConnection.getSurroundingText(i, i2, i3);
            if (surroundingText == null) {
                return null;
            }
            CharSequence text = surroundingText.getText();
            int selectionStart = surroundingText.getSelectionStart();
            int selectionEnd = surroundingText.getSelectionEnd();
            int offset = surroundingText.getOffset();
            int i4 = selectionStart > selectionEnd ? selectionStart : selectionEnd;
            if (selectionStart > selectionEnd) {
                selectionStart = selectionEnd;
            }
            int length = text.length();
            return new hqk(text, Math.max(0, Math.min(selectionStart, length)), Math.max(0, Math.min(i4, length)), offset, false);
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/libraries/inputmethod/inputconnection/InputConnectionUtil", "getSurroundingText", (char) 193, "InputConnectionUtil.java")).t("Failed to get surrounding text with the new api");
            return null;
        }
    }

    public static CharSequence c(InputConnection inputConnection, int i) {
        a.b("getSelectedText(%d)", Integer.valueOf(i));
        return inputConnection.getSelectedText(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence d(InputConnection inputConnection, int i, int i2) {
        a.c("getTextAfterCursor(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        return inputConnection.getTextAfterCursor(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence e(InputConnection inputConnection, int i, int i2) {
        a.c("getTextBeforeCursor(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2));
        return inputConnection.getTextBeforeCursor(i, i2);
    }

    public static void f(InputConnection inputConnection, String str) {
        TextUtils.isEmpty(str);
        a.a("beginBatchEdit()");
        inputConnection.beginBatchEdit();
    }

    public static void g(InputConnection inputConnection, CompletionInfo completionInfo) {
        completionInfo.getText();
        a.a("commitCompletion(<completionInfo>)");
        inputConnection.commitCompletion(completionInfo);
    }

    public static void h(InputConnection inputConnection, CorrectionInfo correctionInfo) {
        correctionInfo.getOldText();
        correctionInfo.getNewText();
        correctionInfo.getOffset();
        a.a("commitCorrection(<correctionInfo>>)");
        inputConnection.commitCorrection(correctionInfo);
    }

    public static void i(InputConnection inputConnection, CharSequence charSequence, int i) {
        a.a("commitText(<text>, <newCursorPosition>)");
        inputConnection.commitText(charSequence, i);
    }

    public static void j(InputConnection inputConnection, int i, int i2) {
        a.a("deleteSurroundingText(<leftLength>, <rightLength>)");
        inputConnection.deleteSurroundingText(i, i2);
    }

    public static void k(InputConnection inputConnection, CharSequence charSequence, int i, Object obj) {
        a.a("setComposingText(<text>, <newCursorPosition>)");
        if (!li.f() || !(obj instanceof TextAttribute)) {
            inputConnection.setComposingText(charSequence, i);
        } else {
            inputConnection.setComposingText(charSequence, i, (TextAttribute) obj);
        }
    }

    public static void l(InputConnection inputConnection, boolean z) {
        a.b("setImeConsumesInput(%b)", Boolean.valueOf(z));
        inputConnection.setImeConsumesInput(z);
    }

    public static void m(InputConnection inputConnection, int i, int i2) {
        a.a("setSelection(<start>, <end>)");
        inputConnection.setSelection(i, i2);
    }
}
