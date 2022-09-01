package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* renamed from: hce  reason: default package */
/* loaded from: classes.dex */
public final class hce implements hcg {
    public final /* synthetic */ hci a;

    public hce(hci hciVar) {
        this.a = hciVar;
    }

    @Override // defpackage.hbq
    public final boolean A(View view) {
        String[] strArr;
        EmojiView emojiView = (EmojiView) view.findViewById(R.id.f54310_resource_name_obfuscated_res_0x7f0b0193);
        if (emojiView != null) {
            hci hciVar = this.a;
            if (hciVar.q != null && (strArr = emojiView.b) != null && strArr.length > 0) {
                gqa.a(hciVar.g).j(R.string.f159360_resource_name_obfuscated_res_0x7f1405d1);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = hciVar.q;
                if (emojiPickerBodyRecyclerView != null) {
                    emojiPickerBodyRecyclerView.a(false);
                }
                this.a.m.b();
                int[] iArr = new int[2];
                hci hciVar2 = this.a;
                View view2 = hciVar2.A;
                if (view2 != null) {
                    view2.getLocationInWindow(iArr);
                    iArr[1] = iArr[0] + hciVar2.A.getWidth();
                } else {
                    iArr[0] = 0;
                    iArr[1] = hciVar2.g.getResources().getDisplayMetrics().widthPixels;
                }
                hci hciVar3 = this.a;
                hciVar3.m.c(view, hciVar3.q, strArr, new dww(this, 4), this.a.z, view.getWidth(), view.getHeight(), iArr[0], iArr[1], emojiView.c);
                hcg hcgVar = this.a.b;
                if (hcgVar != null) {
                    hcgVar.A(view);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hcg
    public final void l(int i, int i2) {
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.l(i, i2);
        }
    }

    @Override // defpackage.hcg
    public final void m() {
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.m();
        }
    }

    @Override // defpackage.hbq
    public final void t(hei heiVar) {
        llp llpVar = this.a.c;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hdj) llpVar.get(i2)).d(icu.n(heiVar.b));
        }
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.t(heiVar);
        }
    }

    @Override // defpackage.hbq
    public final void u(hei heiVar) {
        hbw hbwVar;
        llp llpVar = this.a.c;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hdj) llpVar.get(i2)).d(icu.n(heiVar.b));
        }
        hci hciVar = this.a;
        if (hciVar.k && hciVar.n.e(heiVar.b) && (hbwVar = this.a.s) != null) {
            String str = heiVar.b;
            if (!hbwVar.n.a(str).isEmpty()) {
                String b = hbwVar.n.b(str);
                hbv hbvVar = (hbv) hbwVar.i.get(b);
                if (hbvVar != null) {
                    hbwVar.m.f();
                    hbwVar.m.f();
                    hbwVar.hg(hbwVar.z(hbvVar.a) + hbvVar.b);
                }
                int i3 = hbwVar.h;
                if (i3 >= 0) {
                    int c = hbwVar.g.c(i3);
                    int b2 = hbwVar.g.b(hbwVar.h);
                    for (int i4 = c; i4 < c + b2; i4++) {
                        hda hdaVar = hbwVar.g.get(i4);
                        if ((hdaVar instanceof hcq) && ((hcq) hdaVar).d.equals(b)) {
                            hbwVar.hg(i4);
                        }
                    }
                }
            }
        }
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.u(heiVar);
        }
        this.a.m.b();
    }

    @Override // defpackage.hbq
    public final void w(View view, MotionEvent motionEvent) {
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.w(view, motionEvent);
        }
    }

    @Override // defpackage.hcg
    public final void H(int i, int i2) {
        int a;
        int i3;
        hci hciVar = this.a;
        hcl hclVar = hciVar.r;
        if (hclVar != null && (a = hciVar.a(i)) <= hclVar.ha() - 1 && a != (i3 = hclVar.d)) {
            hclVar.d = a;
            hclVar.hg(i3);
            hclVar.hg(hclVar.d);
        }
        hci hciVar2 = this.a;
        RecyclerView recyclerView = hciVar2.p;
        if (recyclerView != null) {
            recyclerView.Y(hciVar2.a(i));
        }
        hci hciVar3 = this.a;
        dxe dxeVar = hciVar3.C;
        if (dxeVar != null && i == hciVar3.i && hciVar3.s != null) {
            hiz u = hyq.u(hciVar3.o, dxeVar, hciVar3.l, hciVar3.h, hciVar3.k, hciVar3.f);
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new ehz(this, 10));
            u.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
        }
        boolean z2 = true;
        if (i != 0) {
            hci hciVar4 = this.a;
            if (hciVar4.C == null || i != hciVar4.i) {
                z2 = false;
            }
        }
        hci hciVar5 = this.a;
        if (hciVar5.s != null && z2) {
            hci hciVar6 = this.a;
            hiz r = hyq.r(hciVar5.o, (hdj) hciVar5.d.get(), hciVar6.l, hciVar6.u, hciVar6.f);
            afp afpVar2 = afp.STARTED;
            boolean z3 = jam.b;
            llk e4 = llp.e();
            llk e5 = llp.e();
            llk e6 = llp.e();
            e4.h(new bps(this, i, 2));
            r.E(hjg.a(gyc.b, null, afpVar2, z3, e4, e5, e6));
        }
        hcg hcgVar = this.a.b;
        if (hcgVar != null) {
            hcgVar.H(i, i2);
        }
    }

    @Override // defpackage.hbq
    public final void hx() {
        hci hciVar = this.a;
        llp llpVar = hciVar.c;
        if (((lrl) llpVar).c > 0) {
            hdj hdjVar = (hdj) llpVar.get(0);
            throw null;
        }
        hcg hcgVar = hciVar.b;
        if (hcgVar == null) {
            return;
        }
        hcgVar.hx();
    }
}
