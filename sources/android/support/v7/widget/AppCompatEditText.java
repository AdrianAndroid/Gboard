package android.support.v7.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements za, acv {
    private final jh a;
    private final acu b;
    private final isu c;
    private final adx d;
    private final azp e;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.b();
        }
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // defpackage.acv
    public final void eU(ColorStateList colorStateList) {
        this.a.m(colorStateList);
        this.a.e();
    }

    @Override // defpackage.acv
    public final void eV(PorterDuff.Mode mode) {
        this.a.n(mode);
        this.a.e();
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return up.c(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public final Editable mo22getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        adx adxVar;
        if (Build.VERSION.SDK_INT >= 28 || (adxVar = this.d) == null) {
            return super.getTextClassifier();
        }
        return adxVar.e();
    }

    @Override // defpackage.za
    public final yl ia(yl ylVar) {
        return this.b.a(this, ylVar);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] ak;
        InputConnection abwVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jh.s(this, onCreateInputConnection, editorInfo);
        cz.c(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (ak = aad.ak(this)) != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                editorInfo.contentMimeTypes = ak;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ak);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", ak);
            }
            opu opuVar = new opu(this);
            nd.c(editorInfo, "editorInfo must be non-null");
            if (Build.VERSION.SDK_INT >= 25) {
                abwVar = new abv(onCreateInputConnection, opuVar, null, null, null, null);
            } else if (abu.c(editorInfo).length != 0) {
                abwVar = new abw(onCreateInputConnection, opuVar, null, null, null, null);
            }
            onCreateInputConnection = abwVar;
        }
        return this.e.r(onCreateInputConnection);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && aad.ak(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
            if (activity == null) {
                new StringBuilder("Can't handle drop: no activity: view=").append(this);
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                im.a(dragEvent, this, activity);
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        yg yhVar;
        if (Build.VERSION.SDK_INT < 31 && aad.ak(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    yhVar = new yf(primaryClip, 1);
                } else {
                    yhVar = new yh(primaryClip, 1);
                }
                yhVar.c(i == 16908322 ? 0 : 1);
                aad.s(this, oc.b(yhVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        isu isuVar = this.c;
        if (isuVar != null) {
            isuVar.d(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(up.d(this, callback));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(azp.q(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jh jhVar = this.a;
        if (jhVar != null) {
            jhVar.h(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        adx adxVar;
        if (Build.VERSION.SDK_INT >= 28 || (adxVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            adxVar.b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f11150_resource_name_obfuscated_res_0x7f0403dc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        nt.a(context);
        nr.d(this, getContext());
        isu isuVar = new isu(this);
        this.c = isuVar;
        isuVar.c(attributeSet, i);
        jh jhVar = new jh(this);
        this.a = jhVar;
        jhVar.g(attributeSet, i);
        jhVar.e();
        this.d = new adx(this);
        this.b = new acu();
        azp azpVar = new azp(this);
        this.e = azpVar;
        azpVar.o(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (azp.p(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener q = azp.q(keyListener);
            if (q == keyListener) {
                return;
            }
            super.setKeyListener(q);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }
}
