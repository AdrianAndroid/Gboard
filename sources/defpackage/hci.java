package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hci  reason: default package */
/* loaded from: classes.dex */
public final class hci implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController");
    public View A;
    public final hcg B;
    public final dxe C;
    private final int E;
    private final float F;
    private final int G;
    private final int H;
    private final int I;
    private final llp J;
    private final llp K;
    private final hcm L;
    public final hcg b;
    public final llp c;
    public final AtomicReference d;
    public final Optional e;
    public final boolean f;
    public final Context g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final hdl l;
    public final hcv m;
    public final hbg n;
    public final hbe o;
    public final RecyclerView p;
    public final EmojiPickerBodyRecyclerView q;
    public hcl r;
    public hbw s;
    public final int u;
    public boolean x;
    public boolean y;
    private final mkr D = gxo.a(1);
    private final hcu M = new hcu();
    public final AtomicBoolean t = new AtomicBoolean(false);
    public int v = -1;
    public int w = 1;
    public float z = 1.0f;
    private final hej N = new hcf(this, 0);
    private final View.OnClickListener O = new fat(this, 12);

    public hci(RecyclerView recyclerView, EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, hcg hcgVar, hcm hcmVar, hby hbyVar, hck hckVar) {
        llp r;
        AtomicReference atomicReference = new AtomicReference();
        this.d = atomicReference;
        hce hceVar = new hce(this);
        this.B = hceVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(emojiPickerBodyRecyclerView.getContext(), (int) R.style.f191890_resource_name_obfuscated_res_0x7f150203);
        this.g = contextThemeWrapper;
        this.p = recyclerView;
        this.q = emojiPickerBodyRecyclerView;
        this.b = hcgVar;
        this.L = hcmVar;
        int i = hbyVar.e;
        this.E = i;
        float f = hbyVar.a;
        this.F = f;
        int i2 = hbyVar.b;
        this.G = i2;
        if (f >= 0.0f || i2 != 0) {
            this.I = hbyVar.f;
            hcp hcpVar = new hcp(contextThemeWrapper, null);
            this.m = hcpVar;
            this.u = (f <= 0.0f || hbyVar.c != 0) ? hbyVar.c : ((int) Math.floor(f)) * i;
            int ceil = (f <= 0.0f || hbyVar.d != 0) ? hbyVar.d : ((int) Math.ceil(f)) * i;
            this.H = ceil;
            if (ceil <= 0) {
                throw new IllegalArgumentException("Invalid pool size.");
            }
            this.h = i;
            this.f = hbyVar.g;
            this.n = hbd.h(contextThemeWrapper);
            this.o = hbd.h(contextThemeWrapper).g();
            this.k = hckVar.d;
            hcpVar.c = new fat(this, 13);
            this.l = hdn.instance.h;
            llp llpVar = hckVar.a;
            if (llpVar == null || llpVar.isEmpty()) {
                Objects.requireNonNull(emojiPickerBodyRecyclerView);
                r = llp.r(new hbm(contextThemeWrapper, new opu(emojiPickerBodyRecyclerView), null, null, null));
            } else {
                r = hckVar.a;
            }
            this.c = r;
            atomicReference.set((hdj) r.get(0));
            llp llpVar2 = hckVar.b;
            this.J = llpVar2;
            llk e = llp.e();
            e.j(llpVar2);
            Optional optional = hckVar.c;
            this.e = optional;
            Objects.requireNonNull(e);
            optional.ifPresent(new chf(e, 18));
            this.K = e.g();
            dxe dxeVar = hckVar.e;
            this.C = dxeVar;
            this.j = dxeVar != null;
            this.i = dxeVar != null ? 1 : -1;
            knf knfVar = new knf((byte[]) null, (byte[]) null);
            knfVar.l(hbn.a, i);
            knfVar.l(hcq.a, ceil);
            hbo hboVar = new hbo(i, knfVar, hceVar, null, null, null);
            emojiPickerBodyRecyclerView.getContext();
            EmojiPickerLayoutManager emojiPickerLayoutManager = new EmojiPickerLayoutManager(hboVar.a);
            ((GridLayoutManager) emojiPickerLayoutManager).g = new hbz(emojiPickerBodyRecyclerView, hboVar);
            emojiPickerBodyRecyclerView.ab(emojiPickerLayoutManager);
            emojiPickerBodyRecyclerView.aw();
            knf knfVar2 = hboVar.c;
            me meVar = emojiPickerBodyRecyclerView.e;
            meVar.f(meVar.g.l);
            knf knfVar3 = meVar.h;
            if (knfVar3 != null) {
                knfVar3.k();
            }
            meVar.h = knfVar2;
            knf knfVar4 = meVar.h;
            if (knfVar4 != null && meVar.g.l != null) {
                knfVar4.i();
            }
            meVar.e();
            me meVar2 = emojiPickerBodyRecyclerView.e;
            meVar2.e = 0;
            meVar2.o();
            emojiPickerBodyRecyclerView.E = null;
            emojiPickerBodyRecyclerView.U = new hca(hboVar.b);
            emojiPickerBodyRecyclerView.az(emojiPickerBodyRecyclerView.U);
            emojiPickerBodyRecyclerView.Z(new hch(this, emojiPickerBodyRecyclerView));
            recyclerView.ab(new LinearLayoutManager(hcmVar.a == 2 ? 1 : 0));
            recyclerView.Z(new hch(this, recyclerView));
            for (int i3 = 0; i3 < recyclerView.e(); i3++) {
                recyclerView.V(i3);
            }
            if (hcmVar.a != 1) {
                return;
            }
            if (hbyVar.h != -1) {
                this.M.b = 0;
            }
            recyclerView.ay(this.M);
            return;
        }
        throw new IllegalArgumentException("Must provide either row count or row height.");
    }

    public static final boolean k(int i) {
        return i == 0;
    }

    public final int a(int i) {
        if (this.j) {
            i--;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final hbw b() {
        hiz u;
        hbw hbwVar = this.s;
        if (hbwVar != null) {
            return hbwVar;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "getBodyAdapter", 702, "EmojiPickerController.java")).t("getBodyAdapter(), loading emojis. ");
        Context context = this.g;
        llp llpVar = this.K;
        ArrayList arrayList = new ArrayList();
        int[] iArr = har.b;
        for (int i = 0; i < 10; i++) {
            arrayList.add(context.getString(iArr[i]));
        }
        int i2 = ((lrl) llpVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(((hbk) llpVar.get(i3)).c());
        }
        final hbw hbwVar2 = new hbw(context, (String[]) arrayList.toArray(new String[0]), this.F, this.G, this.E, this.I, this.N, this.e.isPresent(), this.i, new etm(this, 15), new etm(this, 16), new gxd(this, 5), new gxd(this, 6), this.n, this.o, this.O);
        hbwVar2.u(true);
        this.y = true;
        final hdl hdlVar = hdn.instance.h;
        final hiz k = hiz.k(hbc.b(this.g).c(this.g, this.D, hdlVar));
        final hiz r = hyq.r(this.o, (hdj) this.d.get(), hdlVar, this.u, this.f);
        dxe dxeVar = this.C;
        if (dxeVar == null) {
            u = hiz.p(hcb.a, mjl.a);
        } else {
            u = hyq.u(this.o, dxeVar, hdlVar, this.h, this.k, this.f);
        }
        final hiz hizVar = u;
        hiz n = hiz.n(null);
        if (this.k) {
            n = this.n.b();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(k);
        arrayList2.add(r);
        arrayList2.add(hizVar);
        arrayList2.add(n);
        final ArrayList arrayList3 = new ArrayList();
        llp llpVar2 = this.J;
        int i4 = ((lrl) llpVar2).c;
        for (int i5 = 0; i5 < i4; i5++) {
            hcz hczVar = (hcz) llpVar2.get(i5);
            arrayList3.add(hczVar.e().u(new hdp(hczVar, 1), this.D));
        }
        arrayList2.addAll(arrayList3);
        hiz f = hiz.K(arrayList2).f();
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new hiu() { // from class: hcc
            @Override // defpackage.hiu
            public final void a(Object obj) {
                llk llkVar;
                String[] strArr;
                hci hciVar = hci.this;
                hiz hizVar2 = k;
                hiz hizVar3 = r;
                hiz hizVar4 = hizVar;
                List<hiz> list = arrayList3;
                hdl hdlVar2 = hdlVar;
                hbw hbwVar3 = hbwVar2;
                Void r6 = (Void) obj;
                List<List> list2 = (List) hizVar2.A(llp.q());
                llp llpVar3 = (llp) hizVar3.A(llp.q());
                llp llpVar4 = (llp) hizVar4.A(llp.q());
                llk e4 = llp.e();
                boolean z2 = hciVar.k;
                boolean z3 = hciVar.f;
                llk e5 = llp.e();
                int i6 = 0;
                for (List<hds> list3 : list2) {
                    llk e6 = llp.e();
                    int i7 = 0;
                    for (hds hdsVar : list3) {
                        int i8 = i7 + 1;
                        String str = hdsVar.a;
                        if (z3) {
                            llkVar = e6;
                            strArr = (String[]) hdsVar.b.toArray(new String[0]);
                        } else {
                            llkVar = e6;
                            strArr = new String[0];
                        }
                        llk llkVar2 = llkVar;
                        llp llpVar5 = llpVar3;
                        llkVar2.h(new hcq(i6, i7, str, strArr, z2));
                        e6 = llkVar2;
                        e5 = e5;
                        z3 = z3;
                        i7 = i8;
                        llpVar4 = llpVar4;
                        llpVar3 = llpVar5;
                    }
                    llp llpVar6 = llpVar3;
                    llk llkVar3 = e5;
                    llkVar3.h(e6.g());
                    i6++;
                    e5 = llkVar3;
                    z3 = z3;
                    llpVar4 = llpVar4;
                    llpVar3 = llpVar6;
                }
                llp llpVar7 = llpVar3;
                llp llpVar8 = llpVar4;
                e4.j(e5.g());
                int size = list2.size();
                int i9 = size;
                for (hiz hizVar5 : list) {
                    e4.h(hyq.p(hciVar.o, (llp) hizVar5.A(llp.q()), i9, hdlVar2, hciVar.k, hciVar.f));
                    i9++;
                }
                if (hciVar.e.isPresent()) {
                    hciVar.v = i9;
                    hciVar.w = 1;
                    e4.h(hciVar.l((hdg) hciVar.e.get(), llp.q()));
                    hciVar.f();
                }
                llp g = e4.g();
                ((ltd) ((ltd) hbw.d.b()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "updateEmojis", 435, "EmojiPickerBodyAdapter.java")).s();
                hbwVar3.g = new hdb(g, hbwVar3.f, hbwVar3.e, hbwVar3.l, hbwVar3.h);
                hbwVar3.g.g(llpVar7);
                hbwVar3.fc();
                hbwVar3.C(llpVar8);
                if (!hciVar.x || !hciVar.y) {
                    return;
                }
                hciVar.x = false;
                hciVar.y = false;
                hciVar.i(llpVar7.isEmpty() ? 1 : 0, 2);
            }
        });
        e2.h(ebj.g);
        e3.h(ebj.h);
        f.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
        this.s = hbwVar2;
        return hbwVar2;
    }

    public final hdj c() {
        if (this.c.isEmpty()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "findNextEmojiProvider", 1034, "EmojiPickerController.java")).t("No recent emoji providers available. ");
            return null;
        }
        llp llpVar = this.c;
        if (((lrl) llpVar).c == 1) {
            return null;
        }
        int indexOf = llpVar.indexOf(this.d.get());
        llp llpVar2 = this.c;
        return (hdj) llpVar2.get((indexOf + 1) % ((lrl) llpVar2).c);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void d() {
        this.x = true;
        this.q.aa(b());
        this.e.ifPresent(new dug(6));
        hcl hclVar = new hcl(this.g, new opu(this), this.K, this.L, null, null, null, null);
        this.r = hclVar;
        this.p.aa(hclVar);
    }

    public final void e() {
        hcv hcvVar = this.m;
        if (hcvVar != null) {
            hcvVar.a();
        }
        this.p.aa(null);
        this.r = null;
        while (this.p.e() > 0) {
            this.p.V(0);
        }
        this.p.ab(null);
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.q;
        emojiPickerBodyRecyclerView.gI();
        emojiPickerBodyRecyclerView.U = null;
        emojiPickerBodyRecyclerView.aa(null);
        while (emojiPickerBodyRecyclerView.e() > 0) {
            emojiPickerBodyRecyclerView.V(0);
        }
        this.s = null;
        try {
            lta listIterator = this.c.listIterator();
            while (listIterator.hasNext()) {
                ((hdj) listIterator.next()).close();
            }
            lta listIterator2 = this.J.listIterator();
            while (listIterator2.hasNext()) {
                ((hcz) listIterator2.next()).close();
            }
            if (!this.e.isPresent()) {
                return;
            }
            ((hdg) this.e.get()).close();
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController", "onDeactivate", (char) 640, "EmojiPickerController.java")).t("error when closing RecentItemProvider or ItemProvider");
        }
    }

    public final void f() {
        this.e.ifPresent(new chf(this, 17));
    }

    public final void g(float f) {
        if (f > 0.0f) {
            this.z = f;
        }
    }

    public final void h(int i) {
        hcu hcuVar = this.M;
        if (i == hcuVar.a) {
            return;
        }
        if (i >= 0) {
            hcuVar.a = i;
        }
        hcl hclVar = this.r;
        if (hclVar == null) {
            return;
        }
        hclVar.fc();
    }

    public final void i(int i, int i2) {
        if (this.j && i >= this.i) {
            i++;
        }
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = this.q;
        if (emojiPickerBodyRecyclerView != null) {
            if (i < 0 || ((lrl) iby.K).c <= i) {
                ((ltd) EmojiPickerBodyRecyclerView.S.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "tryGoToCategory", 124, "EmojiPickerBodyRecyclerView.java")).y("Invalid categoryIndex: %s out of %s", i, ((lrl) iby.K).c);
            } else {
                ls lsVar = emojiPickerBodyRecyclerView.l;
                ly lyVar = emojiPickerBodyRecyclerView.m;
                if ((lsVar instanceof hbw) && (lyVar instanceof GridLayoutManager)) {
                    ((GridLayoutManager) lyVar).ab(((hbw) lsVar).z(i), 0);
                    emojiPickerBodyRecyclerView.T = i;
                }
            }
        }
        this.B.H(i, i2);
    }

    public final hct j(hdg hdgVar) {
        return new hct(this.v, b().y(this.v) - 1, hdgVar.e());
    }

    public final llp l(hdg hdgVar, llp llpVar) {
        if (hdgVar.g()) {
            llk e = llp.e();
            e.j(llpVar);
            e.h(hec.a);
            llpVar = e.g();
        } else if (llpVar.isEmpty()) {
            llpVar = llp.r(icu.o(hdgVar.d()));
        }
        return hyq.p(this.o, llpVar, this.v, this.l, this.k, this.f);
    }
}
