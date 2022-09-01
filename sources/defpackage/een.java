package defpackage;

import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.apps.inputmethod.libs.search.keyboard.EditableKeyboard;
import com.google.android.apps.inputmethod.libs.translate.TranslateKeyboard;

/* compiled from: PG */
/* renamed from: een  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class een implements TextView.OnEditorActionListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public een(SearchView searchView, int i) {
        this.b = i;
        this.a = searchView;
    }

    public /* synthetic */ een(EditableKeyboard editableKeyboard, int i) {
        this.b = i;
        this.a = editableKeyboard;
    }

    public /* synthetic */ een(TranslateKeyboard translateKeyboard, int i) {
        this.b = i;
        this.a = translateKeyboard;
    }

    public /* synthetic */ een(ezx ezxVar, int i) {
        this.b = i;
        this.a = ezxVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = this.b;
        if (i2 == 0) {
            ((EditableKeyboard) this.a).K(textView.getText().toString(), mba.UNKNOWN);
            return true;
        } else if (i2 == 1) {
            ((SearchView) this.a).h();
            return true;
        } else if (i2 != 2) {
            ((hfw) ((dbn) this.a).z()).d.aS(i);
            return true;
        } else {
            Object obj = this.a;
            if (i == 6) {
                ((TranslateKeyboard) obj).m();
                return true;
            }
            TextView.OnEditorActionListener onEditorActionListener = ((TranslateKeyboard) obj).h;
            if (onEditorActionListener == null) {
                return false;
            }
            return onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
    }
}
