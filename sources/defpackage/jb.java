package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jb  reason: default package */
/* loaded from: classes.dex */
public final class jb extends vj {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ jh d;

    public jb(jh jhVar, int i, int i2, WeakReference weakReference) {
        this.d = jhVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.vj
    public final void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = jg.a(typeface, i, (this.b & 2) != 0);
        }
        jh jhVar = this.d;
        WeakReference weakReference = this.c;
        if (jhVar.c) {
            jhVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (aad.ag(textView)) {
                textView.post(new ov(textView, typeface, jhVar.a, 1));
            } else {
                textView.setTypeface(typeface, jhVar.a);
            }
        }
    }

    @Override // defpackage.vj
    public final void b() {
    }
}
