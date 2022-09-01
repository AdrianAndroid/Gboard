package androidx.emoji.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    private boolean a;
    private aqr b;

    public EmojiExtractEditText(Context context) {
        super(context);
        b(null, 0, 0);
    }

    private final void b(AttributeSet attributeSet, int i, int i2) {
        if (!this.a) {
            this.a = true;
            int i3 = 0;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, adk.a, i, i2);
                i3 = obtainStyledAttributes.getInteger(0, Integer.MAX_VALUE);
                obtainStyledAttributes.recycle();
            }
            aqr a = a();
            nq.f(i3, "maxEmojiCount should be greater than 0");
            ((aec) ((bek) a.a).a).a = i3;
            setKeyListener(super.getKeyListener());
        }
    }

    public final aqr a() {
        if (this.b == null) {
            this.b = new aqr(this, (byte[]) null);
        }
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        aqr a = a();
        if (onCreateInputConnection == null) {
            return null;
        }
        return onCreateInputConnection instanceof adz ? onCreateInputConnection : new adz((TextView) ((bek) a.a).b, onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(up.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            Object obj = a().a;
            if (!(keyListener instanceof aea)) {
                keyListener = new aea(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 16842862, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet, i, 0);
    }

    public EmojiExtractEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(attributeSet, i, i2);
    }
}
