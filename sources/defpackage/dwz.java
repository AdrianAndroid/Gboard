package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.AppCompatTextView;
import android.view.ViewTreeObserver;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwz  reason: default package */
/* loaded from: classes.dex */
public final class dwz implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ AppCompatTextView a;
    final /* synthetic */ String b;
    final /* synthetic */ dxf c;
    final /* synthetic */ dxa d;

    public dwz(dxa dxaVar, AppCompatTextView appCompatTextView, String str, dxf dxfVar) {
        this.d = dxaVar;
        this.a = appCompatTextView;
        this.b = str;
        this.c = dxfVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        Rect rect = new Rect();
        if (!this.d.c.getGlobalVisibleRect(rect) || this.d.c.getWidth() != rect.width()) {
            this.a.setText(this.c.a(this.d.b.getString(R.string.f158830_resource_name_obfuscated_res_0x7f14057b, this.b)));
            this.a.requestLayout();
            return false;
        }
        return true;
    }
}
