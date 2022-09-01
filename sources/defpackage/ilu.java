package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ilu  reason: default package */
/* loaded from: classes.dex */
public final class ilu implements AutoCloseable {
    public final Context a;
    public final hxk b;
    public final jdk c;
    public View d;
    public iay e;
    public int f;
    public final int g;
    public final SparseArray h;
    public final imn i;
    public final gqa j;
    public final View.OnClickListener k;
    public long l;
    public long m;
    public long n;
    public final View o;
    public View p;
    public final hek q;

    public ilu(Context context, int i, imn imnVar, hek hekVar, View.OnClickListener onClickListener, View view, byte[] bArr, byte[] bArr2) {
        SparseArray sparseArray = new SparseArray(2);
        this.h = sparseArray;
        this.a = context;
        this.b = hxk.a(context);
        this.i = imnVar;
        this.q = hekVar;
        this.f = i;
        this.g = i;
        this.k = onClickListener;
        jdk jdkVar = new jdk(context);
        this.c = jdkVar;
        jdkVar.setEnabled(false);
        jdkVar.setClickable(false);
        jdkVar.a = new opu(this);
        jdkVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        View view2 = null;
        if (i != 0) {
            View inflate = View.inflate(context, i, null);
            this.d = inflate;
            jdkVar.addView(inflate);
            sparseArray.put(i, this.d);
        }
        this.j = gqa.a(context);
        this.o = view != null ? view.findViewById(R.id.keyboard_holder) : view2;
    }

    private final void e() {
        View view = this.p;
        if (view == null || !this.i.f(view)) {
            return;
        }
        this.i.c(this.p, null, false);
    }

    public final void a(long j) {
        if (this.m == 0) {
            this.m = j;
            this.l = 0L;
        }
        if (this.i.f(this.c)) {
            this.j.g(R.string.f149490_resource_name_obfuscated_res_0x7f14011b, new Object[0]);
        }
        Animator animator = null;
        this.e = null;
        ilv ilvVar = (ilv) this.d;
        if (ilvVar != null) {
            ilvVar.e();
        }
        if (ilvVar != null && ilvVar.j()) {
            e();
        }
        if (ilvVar != null) {
            animator = ilvVar.m(this.q);
        }
        this.i.d(this.c, animator, false);
    }

    public final boolean b() {
        return d() && ((ilv) this.d).g();
    }

    public final boolean c(float f, float f2, boolean z) {
        if (b()) {
            this.e = ((ilv) this.d).a(f, f2, z);
            return true;
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e();
        this.i.c(this.c, null, false);
        this.d = null;
        this.f = 0;
        this.h.clear();
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
    }

    public final boolean d() {
        View view = this.d;
        return view != null && view.isShown();
    }
}
