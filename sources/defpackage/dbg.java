package defpackage;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* renamed from: dbg  reason: default package */
/* loaded from: classes.dex */
public final class dbg implements View.OnClickListener {
    private final /* synthetic */ int a;
    private final Object b;

    public dbg(InputMethodService inputMethodService, int i) {
        this.a = i;
        this.b = inputMethodService;
    }

    public dbg(View.OnClickListener onClickListener, int i) {
        this.a = i;
        this.b = onClickListener;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 0) {
            hxk.a(view.getContext()).c(view, null);
            this.b.onClick(view);
        } else if (i == 1) {
            EditorInfo currentInputEditorInfo = ((InputMethodService) this.b).getCurrentInputEditorInfo();
            InputConnection currentInputConnection = ((InputMethodService) this.b).getCurrentInputConnection();
            if (currentInputEditorInfo == null || currentInputConnection == null) {
                return;
            }
            if (currentInputEditorInfo.actionId != 0) {
                currentInputConnection.performEditorAction(currentInputEditorInfo.actionId);
            } else if ((currentInputEditorInfo.imeOptions & 255) == 1) {
            } else {
                currentInputConnection.performEditorAction(currentInputEditorInfo.imeOptions & 255);
            }
        } else {
            EditorInfo currentInputEditorInfo2 = ((InputMethodService) this.b).getCurrentInputEditorInfo();
            InputConnection currentInputConnection2 = ((InputMethodService) this.b).getCurrentInputConnection();
            if (currentInputEditorInfo2 == null || currentInputConnection2 == null) {
                return;
            }
            if (currentInputEditorInfo2.actionId != 0) {
                currentInputConnection2.performEditorAction(currentInputEditorInfo2.actionId);
            } else if ((currentInputEditorInfo2.imeOptions & 255) == 1) {
            } else {
                currentInputConnection2.performEditorAction(currentInputEditorInfo2.imeOptions & 255);
            }
        }
    }
}
