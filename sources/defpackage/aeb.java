package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: aeb  reason: default package */
/* loaded from: classes.dex */
final class aeb extends us {
    private final Reference a;

    public aeb(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.us
    public final void d() {
        EditText editText = (EditText) this.a.get();
        if (editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        adq.b().c(editableText, 0, editableText == null ? 0 : editableText.length(), Integer.MAX_VALUE, 0);
        if (selectionStart >= 0 && selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionStart, selectionEnd);
        } else if (selectionStart >= 0) {
            Selection.setSelection(editableText, selectionStart);
        } else if (selectionEnd < 0) {
        } else {
            Selection.setSelection(editableText, selectionEnd);
        }
    }
}
