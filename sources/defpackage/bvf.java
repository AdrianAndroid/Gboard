package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.clipboard.ClipboardContentProvider;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: bvf  reason: default package */
/* loaded from: classes.dex */
public final class bvf extends ls implements bup {
    public static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardAdapter");
    public final Context f;
    public boolean g;
    public int i;
    public final buq j;
    public RecyclerView k;
    public ImageView l;
    public View m;
    public final bvc n;
    public ot o;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    private int v;
    private int w;
    private boolean x;
    private final bws y;
    public final Map e = new HashMap();
    public final SparseArray h = new SparseArray();
    private final Comparator u = xr.d;
    public final List p = new ArrayList();

    public bvf(Context context, bvc bvcVar) {
        buq buqVar = new buq(context);
        this.f = context;
        this.j = buqVar;
        this.n = bvcVar;
        this.y = new bws(context.getResources().getDimensionPixelSize(R.dimen.f36860_resource_name_obfuscated_res_0x7f070305));
    }

    private static bvd J(ViewGroup viewGroup) {
        return new bvd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f133680_resource_name_obfuscated_res_0x7f0e0040, viewGroup, false));
    }

    private static bve K(ViewGroup viewGroup) {
        return new bve(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f144920_resource_name_obfuscated_res_0x7f0e0516, viewGroup, false));
    }

    private final void L(ImageView imageView, ImageView imageView2, String str) {
        hjq.a(this.f).j(str).r(imageView);
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
    }

    private final void M(View view) {
        view.setOutlineProvider(this.y);
        view.setClipToOutline(true);
    }

    private final void N() {
        int indexOf = this.p.indexOf(buk.b);
        int indexOf2 = this.p.indexOf(buk.c);
        this.q = indexOf - 1;
        this.v = (indexOf2 - indexOf) - 1;
        this.w = (this.p.size() - indexOf2) - 1;
        int indexOf3 = this.p.indexOf(buk.b);
        int indexOf4 = this.p.indexOf(buk.c);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            indexOf3++;
            if (indexOf3 < indexOf4) {
                String i = ((buk) this.p.get(indexOf3)).i();
                int i2 = 0;
                sb.append(i == null ? 0 : i.length());
                if (i != null) {
                    i2 = TextUtils.split(i, " ").length;
                }
                sb2.append(i2);
                if (indexOf3 != indexOf4 - 1) {
                    sb.append(" ");
                    sb2.append(" ");
                }
            } else {
                ino.M(this.f).u(R.string.f160570_resource_name_obfuscated_res_0x7f140656, sb.toString());
                ino.M(this.f).u(R.string.f160580_resource_name_obfuscated_res_0x7f140657, sb2.toString());
                return;
            }
        }
    }

    public static List x(SparseArray sparseArray, boolean z) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            buk bukVar = (buk) sparseArray.valueAt(i);
            if (bukVar.m() == z) {
                arrayList.add(bukVar);
            }
        }
        return arrayList;
    }

    public static List y(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    public final void A(buk bukVar, int i) {
        this.p.add(i, bukVar);
        D(bukVar);
        H(true);
        hi(i);
        C();
    }

    public final void B(SparseArray sparseArray, List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        Collections.sort(list, this.u);
        this.p.addAll(i, list);
        for (int i2 = i; i2 < list.size() + i; i2++) {
            buk bukVar = (buk) this.p.get(i2);
            D(bukVar);
            int keyAt = sparseArray.keyAt(sparseArray.indexOfValue(bukVar));
            hj(keyAt, i2);
            if (keyAt < i2) {
                j(keyAt, i2);
            } else {
                j(i2, keyAt);
            }
        }
    }

    public final void C() {
        int b = ClipboardContentProvider.b();
        if (((Boolean) bwv.l.c()).booleanValue()) {
            int a = ClipboardContentProvider.a() - this.v;
            if (this.q <= a) {
                HashSet hashSet = new HashSet();
                int i = 0;
                while (true) {
                    int i2 = this.q;
                    if (i >= i2) {
                        b = i2;
                        break;
                    }
                    int i3 = i + 1;
                    hashSet.add(Long.valueOf(((buk) this.p.get(i3)).e));
                    if (hashSet.size() > b) {
                        b = i;
                        break;
                    }
                    i = i3;
                }
            } else {
                b = a;
            }
        }
        int i4 = this.q;
        if (i4 > b) {
            while (i4 > b) {
                this.p.remove(i4);
                m(i4);
                i4--;
            }
            N();
        }
    }

    final void D(buk bukVar) {
        if (TextUtils.isEmpty(bukVar.i())) {
            String j = bukVar.j();
            if (TextUtils.isEmpty(j) || this.e.containsKey(j)) {
                return;
            }
            try {
                this.e.put(j, MediaStore.Images.Media.getBitmap(this.f.getContentResolver(), Uri.parse(j)));
            } catch (IOException | IllegalStateException | SecurityException e) {
                ((ltd) ((ltd) ((ltd) d.d()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardAdapter", "maybeInsertImageToImageMap", (char) 1062, "ClipboardAdapter.java")).t("Error getting bitmap from uri");
            }
        }
    }

    public final void E(buk bukVar) {
        int indexOf = this.p.indexOf(bukVar.l() ? buk.b : buk.a) + 1;
        RecyclerView recyclerView = this.k;
        StaggeredGridLayoutManager staggeredGridLayoutManager = recyclerView == null ? null : (StaggeredGridLayoutManager) recyclerView.m;
        if (staggeredGridLayoutManager == null) {
            A(bukVar, indexOf);
            return;
        }
        int a = this.n.a();
        int[] iArr = new int[a];
        staggeredGridLayoutManager.M(iArr);
        int i = iArr[0];
        if (a < staggeredGridLayoutManager.a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + staggeredGridLayoutManager.a + ", array size:" + a);
        }
        for (int i2 = 0; i2 < staggeredGridLayoutManager.a; i2++) {
            no noVar = staggeredGridLayoutManager.b[i2];
            iArr[i2] = noVar.f.e ? noVar.d(0, noVar.a.size(), true) : noVar.d(noVar.a.size() - 1, -1, true);
        }
        int i3 = iArr[0];
        if (i == -1 || i3 == -1 || (indexOf >= i && indexOf <= i3)) {
            A(bukVar, indexOf);
            return;
        }
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.az(new bva(this, bukVar, indexOf));
        bvb bvbVar = new bvb(this.f);
        bvbVar.b = indexOf - 1;
        staggeredGridLayoutManager.bd(bvbVar);
    }

    public final void F() {
        final buq buqVar = this.j;
        kcu.U(gxo.a(1).hQ(new Callable() { // from class: bun
            /* JADX WARN: Removed duplicated region for block: B:55:0x024f A[Catch: all -> 0x0253, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0259, blocks: (B:65:0x022a, B:56:0x0258, B:55:0x024f), top: B:25:0x0129 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 646
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bun.call():java.lang.Object");
            }
        }), new buo(buqVar, 0), gyc.a);
    }

    public final void G(boolean z) {
        this.g = z;
        int i = 0;
        if (!z) {
            this.h.clear();
            this.i = 0;
        }
        ImageView imageView = this.l;
        if (imageView != null) {
            if (true != z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void H(boolean z) {
        ImageView imageView;
        N();
        int indexOf = this.p.indexOf(buk.b);
        int indexOf2 = this.p.indexOf(buk.c);
        int i = 0;
        boolean z2 = this.q > 0;
        boolean z3 = this.v > 0;
        boolean z4 = this.w > 0;
        if (this.r != z2) {
            this.r = z2;
            if (z) {
                hg(0);
            }
        }
        if (this.s != z3) {
            this.s = z3;
            if (z) {
                hg(indexOf);
            }
        }
        if (this.x != z4) {
            this.x = z4;
            if (z) {
                hg(indexOf2);
            }
        }
        View view = this.m;
        if (view != null) {
            if (true != I()) {
                i = 8;
            }
            view.setVisibility(i);
            if (!I() || (imageView = this.l) == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    final boolean I() {
        return this.p.size() <= 3;
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.p.size();
    }

    @Override // defpackage.ls
    public final int he(int i) {
        buk bukVar = (buk) this.p.get(i);
        if (bukVar == null) {
            return 0;
        }
        return bukVar.f();
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        Bitmap bitmap;
        int a;
        String i2;
        int e;
        final buk bukVar = (buk) this.p.get(i);
        if (bukVar == null) {
            return;
        }
        boolean z = true;
        int i3 = 0;
        if (moVar instanceof bvd) {
            final bvd bvdVar = (bvd) moVar;
            if (bukVar.m()) {
                bvdVar.E.setVisibility(0);
                Context context = this.f;
                int i4 = bukVar.g.c;
                bvdVar.C.setImageDrawable(context.getDrawable((i4 & 4) == 4 ? R.drawable.f46700_resource_name_obfuscated_res_0x7f080186 : (i4 & 8) == 8 ? R.drawable.f50350_resource_name_obfuscated_res_0x7f080349 : (i4 & 16) == 16 ? R.drawable.f50190_resource_name_obfuscated_res_0x7f080337 : (i4 & 32) == 32 ? R.drawable.f47350_resource_name_obfuscated_res_0x7f0801d3 : 0));
                gqa.r(bvdVar.t, bukVar.e());
                M(bvdVar.u);
                bvdVar.u.setVisibility(0);
                bvdVar.D.setVisibility(8);
                bvdVar.x.setVisibility(8);
            } else {
                bvdVar.E.setVisibility(8);
                String i5 = bukVar.i();
                if (!TextUtils.isEmpty(i5)) {
                    gqa.s(bvdVar.t, i5);
                    M(bvdVar.u);
                    bvdVar.u.setVisibility(0);
                    bvdVar.x.setVisibility(8);
                    if (bukVar.c() == 0 || (a = bukVar.a()) == 0) {
                        bvdVar.D.setVisibility(8);
                    } else {
                        bvdVar.D.setVisibility(0);
                        bvdVar.D.setImageDrawable(this.f.getDrawable(a));
                    }
                } else {
                    String j = bukVar.j();
                    long j2 = bukVar.e;
                    if (j != null && (bitmap = (Bitmap) this.e.get(j)) != null) {
                        if (bitmap.getHeight() > bitmap.getWidth()) {
                            L(bvdVar.w, bvdVar.v, j);
                            M(bvdVar.w);
                        } else {
                            L(bvdVar.v, bvdVar.w, j);
                            M(bvdVar.v);
                        }
                    }
                    bvdVar.x.setVisibility(0);
                    gqa.q(bvdVar.x, this.n.d(j2));
                    M(bvdVar.x);
                    bvdVar.u.setVisibility(4);
                    bvdVar.D.setVisibility(8);
                }
            }
            bvdVar.a.setOnClickListener(new buw(this, bukVar, bvdVar, 0));
            bvdVar.a.setOnLongClickListener(new View.OnLongClickListener() { // from class: bux
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    bvf bvfVar = bvf.this;
                    bvd bvdVar2 = bvdVar;
                    buk bukVar2 = bukVar;
                    if (gqa.a(bvfVar.f).e) {
                        bvdVar2.s.performAccessibilityAction(128, null);
                    }
                    bvfVar.t = true;
                    bvc bvcVar = bvfVar.n;
                    int b = bvdVar2.b();
                    View view2 = bvdVar2.a;
                    no noVar = ((nk) view2.getLayoutParams()).a;
                    bvcVar.k(bukVar2, b, view2, (noVar == null ? -1 : noVar.e) == bvfVar.n.a() + (-1));
                    bwg.d(view);
                    return true;
                }
            });
            bvdVar.y.setOnClickListener(new buw(this, bvdVar, bukVar, 2));
            if (!this.g) {
                bvdVar.B.setVisibility(8);
                return;
            }
            bvdVar.B.setVisibility(0);
            CheckBox checkBox = bvdVar.y;
            Object obj = this.h.get(bvdVar.b());
            if (obj == null) {
                z = false;
            }
            bvdVar.z.setVisibility(obj != null ? 0 : 8);
            View view = bvdVar.A;
            if (obj != null) {
                i3 = 8;
            }
            view.setVisibility(i3);
            checkBox.setChecked(z);
            Context context2 = checkBox.getContext();
            if (!bukVar.m() || (e = bukVar.e()) == 0) {
                i2 = bukVar.i();
            } else {
                i2 = context2.getString(e);
            }
            gqa.q(checkBox, i2);
        } else if (!(moVar instanceof bve)) {
        } else {
            int f = bukVar.f();
            if (f == 1) {
                bve bveVar = (bve) moVar;
                if (true != this.r) {
                    i3 = 8;
                }
                bveVar.F(i3);
            } else if (f == 2) {
                bve bveVar2 = (bve) moVar;
                if (true != this.s) {
                    i3 = 8;
                }
                bveVar2.F(i3);
            } else if (f != 3) {
            } else {
                bve bveVar3 = (bve) moVar;
                if (true != this.x) {
                    i3 = 8;
                }
                bveVar3.F(i3);
            }
        }
    }

    public final void z(SparseArray sparseArray, boolean z) {
        List<Integer> y = y(sparseArray);
        Collections.sort(y, Collections.reverseOrder());
        for (Integer num : y) {
            this.p.remove(num.intValue());
        }
        if (z) {
            for (Integer num2 : y) {
                m(num2.intValue());
            }
        }
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                bve K = K(viewGroup);
                gqa.r(K.s, R.string.f149430_resource_name_obfuscated_res_0x7f140115);
                return K;
            } else if (i == 2) {
                bve K2 = K(viewGroup);
                gqa.r(K2.s, R.string.f149300_resource_name_obfuscated_res_0x7f140108);
                return K2;
            } else if (i == 3) {
                bve K3 = K(viewGroup);
                gqa.r(K3.s, R.string.f149380_resource_name_obfuscated_res_0x7f140110);
                return K3;
            } else {
                ((ltd) d.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardAdapter", "onCreateViewHolder", 508, "ClipboardAdapter.java")).t("Incompatible type for view holder.");
                return J(viewGroup);
            }
        }
        return J(viewGroup);
    }
}
