package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: chc  reason: default package */
/* loaded from: classes.dex */
public class chc extends cum {
    public static final /* synthetic */ int s = 0;
    private final cha u;
    private final leq v;
    private final his w;
    private final String x;
    private final leq y;
    private final dxs z;

    public chc(View view, leq leqVar, his hisVar, dxs dxsVar, leq leqVar2, byte[] bArr, byte[] bArr2) {
        super(view);
        this.v = leqVar;
        this.w = hisVar;
        this.z = dxsVar;
        cha chaVar = (cha) aad.q(view, R.id.f52400_resource_name_obfuscated_res_0x7f0b0080);
        this.u = chaVar;
        CharSequence contentDescription = chaVar.getContentDescription();
        this.x = contentDescription != null ? contentDescription.toString() : null;
        this.y = leqVar2;
    }

    public static osr K() {
        return new osr((byte[]) null, (byte[]) null);
    }

    @Override // defpackage.cum
    public void F(Object obj, int i) {
        String str;
        cqp cqpVar = (cqp) this.v.a(obj);
        this.u.e(this.z.m(cqpVar.d()));
        cha chaVar = this.u;
        if (cqpVar.n() != null) {
            str = cqpVar.n();
        } else {
            str = this.x;
        }
        chaVar.setContentDescription(str);
        this.u.c(cqpVar, new chb(this, obj), (atk) this.y.a(obj));
    }

    @Override // defpackage.cum
    public final void G() {
        this.u.d();
        if (this.w != null) {
            this.u.setOnClickListener(null);
        }
        this.u.setContentDescription(this.x);
    }

    @Override // defpackage.cum
    public final boolean H(Object obj) {
        if (obj instanceof chh) {
            this.u.e((chh) obj);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean I(Object obj) {
        if (!this.u.g()) {
            if (s()) {
                cuj cujVar = ((cum) this).t;
                int indexOf = cujVar.d.indexOf(new cuq(obj));
                if (indexOf < 0) {
                    return true;
                }
                cujVar.F(indexOf);
                return true;
            }
            throw new IllegalStateException("Adapter access attempted on an unbound view holder");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(int i, Object obj) {
        his hisVar;
        if (i != 1 || (hisVar = this.w) == null) {
            return;
        }
        this.u.setOnClickListener(new dbg(new buw(this, hisVar, obj, 3), 0));
    }
}
