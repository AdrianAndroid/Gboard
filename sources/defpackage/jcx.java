package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* compiled from: PG */
/* renamed from: jcx  reason: default package */
/* loaded from: classes.dex */
public final class jcx extends InputConnectionWrapper {
    public final EditText a;
    public final EditorInfo b;

    public jcx(EditText editText, EditorInfo editorInfo) {
        super(editText.onCreateInputConnection(editorInfo), true);
        this.a = editText;
        this.b = editorInfo;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (action == 0) {
            return this.a.onKeyDown(keyCode, keyEvent);
        }
        if (action == 2) {
            return this.a.onKeyMultiple(keyCode, keyEvent.getRepeatCount(), keyEvent);
        }
        if (action == 1) {
            return this.a.onKeyUp(keyCode, keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
