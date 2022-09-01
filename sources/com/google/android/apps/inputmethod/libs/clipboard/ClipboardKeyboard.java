package com.google.android.apps.inputmethod.libs.clipboard;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClipboardKeyboard extends Keyboard implements bvc, bwq, bwu, inm, bwi {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard");
    public bvx b;
    public bvf c;
    public llp d;
    private bwr e;
    private View f;
    private RecyclerView g;
    private AppCompatTextView h;
    private PopupWindow i;
    private hfl j;
    private boolean k;
    private ovg l;

    public ClipboardKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    private final View K() {
        View d = this.v.d();
        if (d == null) {
            return null;
        }
        return d.findViewById(R.id.keyboard_holder);
    }

    private static List L(SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((buk) sparseArray.valueAt(i));
        }
        return arrayList;
    }

    private final void N(boolean z) {
        SparseArray sparseArray = new SparseArray();
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            SparseArray sparseArray2 = bvfVar.h;
            long currentTimeMillis = System.currentTimeMillis();
            int size = sparseArray2.size() - 1;
            while (size >= 0) {
                buk bukVar = (buk) sparseArray2.valueAt(size);
                if (z) {
                    l().e(bwa.PIN_ITEM_TIME, Long.valueOf(currentTimeMillis - bukVar.e));
                }
                bukVar.k(z);
                V(bukVar, currentTimeMillis);
                sparseArray.put(sparseArray2.keyAt(size), bukVar);
                size--;
                currentTimeMillis = 1 + currentTimeMillis;
            }
        }
        U(sparseArray, z);
        this.v.z(hfd.d(new iay(-10115, null, null)));
    }

    private final void O(buk bukVar, int i, boolean z) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(i, bukVar);
        P(sparseArray, z);
        this.k = true;
    }

    private final void P(SparseArray sparseArray, boolean z) {
        bui buiVar;
        List L = L(sparseArray);
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            bvfVar.z(sparseArray, true);
            bvfVar.H(true);
        }
        bvx bvxVar = this.b;
        if (bvxVar != null && (buiVar = ((bvt) bvxVar).b.k) != null && buiVar.g != null) {
            Iterator it = L.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                buk bukVar = (buk) it.next();
                llp llpVar = buiVar.g;
                if (llpVar != null && llpVar.contains(bukVar)) {
                    buiVar.a(10);
                    break;
                }
            }
        }
        View K = K();
        if (K != null) {
            if (this.l != null) {
                ovg.a();
            }
            ovg ovgVar = new ovg(this.u, this, sparseArray);
            this.l = ovgVar;
            gyc.b.execute(new bwt(ovgVar, K, 0, null));
        }
        gxo.a(1).hQ(new brs(this, L, 3));
        if (z) {
            t(9);
        } else {
            Q(3);
        }
    }

    private final void Q(int i) {
        l().e(bwa.ITEM_BOARD_OPERATION, Integer.valueOf(i));
    }

    private final void R(float f) {
        View X = X(ice.HEADER);
        if (X != null) {
            X.findViewById(R.id.f53240_resource_name_obfuscated_res_0x7f0b0109).setAlpha(f);
        }
        View X2 = X(ice.BODY);
        if (X2 != null) {
            X2.findViewById(R.id.f53210_resource_name_obfuscated_res_0x7f0b0106).setAlpha(f);
        }
    }

    private final void S(buk bukVar, String str, long j) {
        Uri b = bvu.b(this.u, Uri.parse(str), j);
        if (b != null) {
            bul b2 = bukVar.g.b();
            b2.e(b.toString());
            bukVar.g = b2.a();
        }
    }

    private final void T() {
        hlf hlfVar;
        final View view = this.f;
        if (view != null) {
            final Context context = this.u;
            final int gh = gh();
            final boolean booleanValue = Boolean.valueOf(this.u.getResources().getConfiguration().orientation == 2 && this.v.b() != 3).booleanValue();
            final View X = X(ice.HEADER);
            final View X2 = X(ice.BODY);
            if (X == null || X2 == null) {
                ((ltd) ((ltd) bwc.a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardOptInTooltip", "createClipboardOptInTooltip", 70, "ClipboardOptInTooltip.java")).t("keyboardHeader / keyboardBody is null. Cannot show clipboard opt-in tooltip.");
                hlfVar = null;
            } else {
                hky a2 = hlf.a();
                a2.p("clipboard_opt_in_tooltip");
                a2.m = 1;
                a2.s(booleanValue ? R.layout.f133760_resource_name_obfuscated_res_0x7f0e0048 : R.layout.f133740_resource_name_obfuscated_res_0x7f0e0046);
                a2.o(true);
                a2.m(0L);
                a2.k(true);
                a2.i(true);
                a2.g(context.getString(R.string.f149240_resource_name_obfuscated_res_0x7f140102));
                a2.a = new hle() { // from class: bwb
                    @Override // defpackage.hle
                    public final void a(View view2) {
                        int e;
                        Context context2 = context;
                        View view3 = X;
                        View view4 = X2;
                        int i = gh;
                        boolean z = booleanValue;
                        View view5 = view;
                        int height = view4.getHeight();
                        int height2 = view3.getHeight();
                        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.f53270_resource_name_obfuscated_res_0x7f0b010c);
                        constraintLayout.d(height);
                        constraintLayout.c(height);
                        constraintLayout.setOnTouchListener(cnn.b);
                        int i2 = height + height2;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(z ? R.id.f53330_resource_name_obfuscated_res_0x7f0b0112 : R.id.f53320_resource_name_obfuscated_res_0x7f0b0111);
                        constraintLayout2.setLayoutDirection(i);
                        constraintLayout2.d(i2);
                        constraintLayout2.c(i2);
                        view5.setVisibility(4);
                        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                        View findViewById = view2.findViewById(true != z ? R.id.f53290_resource_name_obfuscated_res_0x7f0b010e : R.id.f53300_resource_name_obfuscated_res_0x7f0b010f);
                        findViewById.measure(View.MeasureSpec.makeMeasureSpec((view4.getWidth() - view4.getPaddingLeft()) - view4.getPaddingRight(), Integer.MIN_VALUE), 0);
                        layoutParams.height = findViewById.getMeasuredHeight() + (bwc.a(context2) / 2);
                        view5.setLayoutParams(layoutParams);
                        view5.requestLayout();
                        View findViewById2 = view3.findViewById(R.id.key_pos_clipboard_batch_pin);
                        float[] fArr = {findViewById2.getWidth() / 2.0f, findViewById2.getHeight() / 2.0f};
                        jdy.h(fArr, findViewById2);
                        float[] fArr2 = {0.0f, 0.0f};
                        jdy.h(fArr2, view3);
                        View findViewById3 = view2.findViewById(R.id.f53310_resource_name_obfuscated_res_0x7f0b0110);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                        int a3 = bwc.a(context2);
                        int scaleY = (int) ((fArr[1] - fArr2[1]) / view4.getScaleY());
                        if (((Boolean) iho.a(context2).c()).booleanValue()) {
                            e = context2.getResources().getDimensionPixelOffset(R.dimen.f32810_resource_name_obfuscated_res_0x7f0700e5);
                        } else {
                            e = jbt.e(context2, R.attr.f2970_resource_name_obfuscated_res_0x7f040059);
                        }
                        int i3 = scaleY + e;
                        float scaleX = view4.getScaleX();
                        float f = fArr[0] - fArr2[0];
                        if (i == 0) {
                            marginLayoutParams.setMargins((int) (((f - (a3 / 2.0f)) / scaleX) - view4.getPaddingStart()), i3, 0, 0);
                        } else {
                            marginLayoutParams.setMargins(0, i3, (int) ((view4.getWidth() - ((f + (a3 / 2.0f)) / scaleX)) - view4.getPaddingStart()), 0);
                        }
                        findViewById3.requestLayout();
                        ((Button) view2.findViewById(R.id.f53280_resource_name_obfuscated_res_0x7f0b010d)).setOnClickListener(new bsx(view5, ino.M(context2), 3));
                    }
                };
                a2.c = X2;
                a2.d = bwe.b;
                hlfVar = a2.a();
            }
            if (hlfVar != null) {
                gyc.b.execute(new bqj(hlfVar, 10));
            }
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                recyclerView.setImportantForAccessibility(4);
            }
            l().e(bwa.USER_OPT_IN, 6);
        }
    }

    private final void U(SparseArray sparseArray, boolean z) {
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add((buk) sparseArray.valueAt(i));
        }
        kcu.U(gxo.a(1).hQ(new brs(this, arrayList, 4)), new bvv(this, sparseArray, z), gyc.a);
    }

    private final void V(buk bukVar, long j) {
        String j2 = bukVar.j();
        if (!TextUtils.isEmpty(j2)) {
            if (((Boolean) bwv.t.c()).booleanValue()) {
                bvx bvxVar = this.b;
                if (bvxVar != null) {
                    ((bvt) bvxVar).b.e();
                }
                Context context = this.u;
                long j3 = bukVar.e;
                lsz it = bvu.c.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    File c = bvu.c(context, j3, str);
                    File c2 = bvu.c(context, j, str);
                    if (c.exists() && !c.renameTo(c2)) {
                        ((ltd) ((ltd) bvu.a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardImageFileProviderUtils", "renameImageFiles", 87, "ClipboardImageFileProviderUtils.java")).G("Failed to rename image clip file %s to %s", c, c2);
                    }
                }
                S(bukVar, j2, j);
            } else if (!bvu.l(this.u, j2)) {
                S(bukVar, j2, j);
            }
        }
        bukVar.e = j;
    }

    private final void W(buk bukVar, int i) {
        if (this.b == null || TextUtils.isEmpty(bukVar.i())) {
            H(bukVar, i);
            return;
        }
        mks a2 = gxo.a(1);
        bvx bvxVar = this.b;
        if (bvxVar == null) {
            return;
        }
        mko d = ((bvt) bvxVar).b.d(bukVar, a2);
        if (d == null) {
            H(bukVar, i);
        } else {
            kcu.U(d, new bvw(this, i, bukVar, 1), a2);
        }
    }

    public final void A() {
        this.v.z(hfd.d(new iay(-10004, null, ibz.a.l)));
    }

    @Override // defpackage.bwu
    public final void E(SparseArray sparseArray) {
        int intValue;
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            if (sparseArray.size() == 0) {
                intValue = -1;
            } else {
                List<Integer> y = bvf.y(sparseArray);
                Collections.sort(y);
                for (Integer num : y) {
                    bvfVar.p.add(num.intValue(), (buk) sparseArray.get(num.intValue()));
                }
                for (Integer num2 : y) {
                    bvfVar.hi(num2.intValue());
                }
                intValue = ((Integer) y.get(0)).intValue();
            }
            bvfVar.H(true);
            RecyclerView recyclerView = bvfVar.k;
            if (recyclerView != null && intValue >= 0) {
                recyclerView.ae(intValue);
            }
        }
        gxo.a(1).hQ(new brs(this, L(sparseArray), 6));
    }

    @Override // defpackage.bwu
    public final void F(SparseArray sparseArray) {
        for (buk bukVar : L(sparseArray)) {
            String j = bukVar.j();
            if (j != null) {
                bvu.i(this.u, bukVar.e, j);
            }
        }
    }

    @Override // defpackage.bwq
    public final void G(buk bukVar, int i) {
        int i2 = 1;
        boolean z = !bukVar.l();
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            l().e(bwa.PIN_ITEM_TIME, Long.valueOf(currentTimeMillis - bukVar.e));
        }
        if (!TextUtils.isEmpty(bukVar.i())) {
            if (true == bukVar.l()) {
                i2 = 2;
            }
            Q(i2);
        }
        bukVar.k(z);
        V(bukVar, currentTimeMillis);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(i, bukVar);
        U(sparseArray, bukVar.l());
    }

    public final void H(buk bukVar, int i) {
        I(llp.r(bukVar), i);
    }

    public final void I(llp llpVar, int i) {
        kcu.U(gxo.a(1).hQ(new brs(this, llpVar, 5)), new bvw(this, llpVar, i, 0), gyc.a);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final void J() {
        A();
    }

    @Override // defpackage.bvc
    public final int a() {
        return (this.v.b() == 3 || ((float) this.u.getResources().getDisplayMetrics().widthPixels) <= this.u.getResources().getDimension(R.dimen.f32700_resource_name_obfuscated_res_0x7f0700da)) ? 2 : 3;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        if (!this.C) {
            return false;
        }
        int i = hfdVar.b[0].c;
        if (i != -10612) {
            if (i == -10119) {
                boolean x = this.t.x(R.string.f160550_resource_name_obfuscated_res_0x7f140654, false);
                idk l = l();
                bwa bwaVar = bwa.USER_OPT_IN;
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(true != x ? 8 : 9);
                l.e(bwaVar, objArr);
                t(true != x ? 6 : 7);
                this.t.q(R.string.f160550_resource_name_obfuscated_res_0x7f140654, !x);
                if (!this.t.x(R.string.f160560_resource_name_obfuscated_res_0x7f140655, false)) {
                    this.t.q(R.string.f160560_resource_name_obfuscated_res_0x7f140655, true);
                }
            } else {
                switch (i) {
                    case -10115:
                        x(0, 0);
                        bvf bvfVar = this.c;
                        if (bvfVar != null) {
                            bvfVar.G(false);
                            this.c.fc();
                        }
                        t(1);
                        break;
                    case -10114:
                        x(1, 0);
                        bvf bvfVar2 = this.c;
                        if (bvfVar2 != null) {
                            bvfVar2.G(true);
                            this.c.fc();
                        }
                        this.k = true;
                        t(0);
                        break;
                    case -10113:
                        N(false);
                        t(5);
                        break;
                    case -10112:
                        N(true);
                        t(4);
                        break;
                    case -10111:
                        SparseArray sparseArray = new SparseArray();
                        bvf bvfVar3 = this.c;
                        if (bvfVar3 != null) {
                            SparseArray sparseArray2 = bvfVar3.h;
                            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                                sparseArray.append(sparseArray2.keyAt(i2), (buk) sparseArray2.valueAt(i2));
                            }
                        }
                        P(sparseArray, true);
                        this.v.z(hfd.d(new iay(-10115, null, null)));
                        t(3);
                        break;
                    default:
                        if (!super.c(hfdVar)) {
                            return false;
                        }
                        break;
                }
            }
        } else {
            View K = K();
            imn s = this.v.s();
            bvx bvxVar = this.b;
            if (bvxVar != null && K != null && s != null) {
                Context context = this.u;
                bvt bvtVar = (bvt) bvxVar;
                bud budVar = bvtVar.c;
                if (budVar != null) {
                    budVar.f(false);
                    bvtVar.c = null;
                }
                hsk hskVar = bvtVar.f.a;
                if ((hskVar == null ? ham.a : hskVar.M()) != bvtVar.f.N()) {
                    bvtVar.f.at(hfd.d(new iay(-10060, null, null)));
                    gyc.b.execute(new bvr(bvtVar, context, s, K, 0));
                } else {
                    bvtVar.r(context, s, K);
                }
            }
            t(2);
        }
        return true;
    }

    @Override // defpackage.bvc, defpackage.bwq
    public final CharSequence d(long j) {
        Context context = this.u;
        gqc h = this.v.h();
        String string = context.getString(R.string.f154200_resource_name_obfuscated_res_0x7f140349, SimpleDateFormat.getDateTimeInstance().format(new Date(j)));
        return TextUtils.isEmpty(string) ? "" : h.a(string);
    }

    @Override // defpackage.bvc
    public final void e(buk bukVar, int i) {
        O(bukVar, i, true);
    }

    @Override // defpackage.bvc
    public final void f() {
        bvx bvxVar = this.b;
        buk bukVar = null;
        if (bvxVar != null) {
            bvt bvtVar = (bvt) bvxVar;
            buk bukVar2 = bvtVar.e;
            bvtVar.e = null;
            bukVar = bukVar2;
        }
        if (bukVar != null) {
            W(bukVar, 1);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        int i;
        hlf a2;
        boolean z;
        super.g(editorInfo, obj);
        int gh = gh();
        long j = this.B;
        ak(gh == 0 ? j & (-9) : j | 8);
        this.t.X(this, R.string.f160550_resource_name_obfuscated_res_0x7f140654);
        this.k = false;
        View X = X(ice.BODY);
        View X2 = X(ice.HEADER);
        if (X2 != null) {
            this.h = (AppCompatTextView) X2.findViewById(R.id.f53230_resource_name_obfuscated_res_0x7f0b0108);
        }
        if (this.c == null) {
            this.c = new bvf(this.u, this);
        }
        bvx bvxVar = this.b;
        if (bvxVar != null) {
            bvxVar.m(true);
            this.b.l(this);
        }
        if (X != null) {
            RecyclerView recyclerView = (RecyclerView) X.findViewById(R.id.f53170_resource_name_obfuscated_res_0x7f0b0102);
            this.g = recyclerView;
            View findViewById = X.findViewById(R.id.f53200_resource_name_obfuscated_res_0x7f0b0105);
            ImageView imageView = (ImageView) X.findViewById(R.id.f53420_resource_name_obfuscated_res_0x7f0b011b);
            View findViewById2 = X.findViewById(R.id.f53430_resource_name_obfuscated_res_0x7f0b011c);
            this.f = findViewById2;
            findViewById2.setVisibility(8);
            if (recyclerView != null && findViewById != null && imageView != null) {
                buk bukVar = null;
                if (!this.t.x(R.string.f160560_resource_name_obfuscated_res_0x7f140655, false)) {
                    bvx bvxVar2 = this.b;
                    if (bvxVar2 != null) {
                        bukVar = ((bvt) bvxVar2).b.c(false);
                    }
                    if (bukVar == null) {
                        z = true;
                    } else {
                        W(bukVar, 2);
                        z = false;
                    }
                    T();
                    x(5, 0);
                } else {
                    if (this.t.x(R.string.f160550_resource_name_obfuscated_res_0x7f140654, false)) {
                        Context context = this.u;
                        View view = this.f;
                        View X3 = X(ice.BODY);
                        if (view != null) {
                            ino K = ino.K(context, null);
                            if (!jez.a(context).e().l() && ((Boolean) bwv.p.c()).booleanValue() && ino.M(context).c("clipboard_paste_times", 0L) >= ((Long) bwv.q.c()).longValue() && K.c("screenshot_tooltip_shown_count", 0L) < ((Long) bwv.r.c()).longValue() && !K.al("clipboard_screenshot_enabled_at_least_once", false, false) && System.currentTimeMillis() - K.c("screenshot_tooltip_latest_display_time", 0L) > ((Long) bwv.s.c()).longValue()) {
                                if (X3 == null) {
                                    ((ltd) ((ltd) bwf.a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardScreenshotTooltip", "createClipboardScreenshotTooltip", 109, "ClipboardScreenshotTooltip.java")).t("keyboardBody is null. Cannot show clipboard screenshot tooltip.");
                                    a2 = null;
                                } else {
                                    hky a3 = hlf.a();
                                    a3.p("clipboard_screenshot_tooltip");
                                    a3.m = 1;
                                    a3.s(R.layout.f133820_resource_name_obfuscated_res_0x7f0e004e);
                                    a3.o(true);
                                    a3.m(0L);
                                    a3.i(true);
                                    a3.g(context.getString(R.string.f149320_resource_name_obfuscated_res_0x7f14010a));
                                    a3.a = new cjp(context, X3, view, 1);
                                    a3.j = new bqj(context, 11);
                                    a3.c = X3;
                                    a3.d = bwe.a;
                                    a2 = a3.a();
                                }
                                if (a2 != null) {
                                    gyc.b.execute(new bqj(a2, 12));
                                    ieh.j().e(bwa.SCREENSHOT_EVENT, 0);
                                }
                            }
                        }
                        x(0, 0);
                    } else {
                        T();
                        x(5, 0);
                    }
                    z = true;
                }
                recyclerView.ab(new StaggeredGridLayoutManager(a()));
                bvf bvfVar = this.c;
                if (bvfVar != null) {
                    bvfVar.k = recyclerView;
                    bvfVar.m = findViewById;
                    bvfVar.j.c = bvfVar;
                    bvfVar.l = imageView;
                    bvfVar.o = new ot(new buz(bvfVar));
                    bvfVar.o.i(recyclerView);
                    recyclerView.az(new buy(bvfVar, imageView));
                    bvfVar.t = false;
                    this.c.G(false);
                }
                recyclerView.aa(this.c);
                if (z) {
                    o();
                }
            }
            if (ham.ae(editorInfo)) {
                PopupWindow popupWindow = new PopupWindow(new View(this.u));
                popupWindow.setFocusable(false);
                popupWindow.setTouchable(true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setBackgroundDrawable(new ShapeDrawable());
                popupWindow.setTouchInterceptor(new bph(this, 5));
                popupWindow.setWidth(1);
                popupWindow.setHeight(1);
                this.i = popupWindow;
                popupWindow.showAtLocation(X, 0, 0, 0);
            }
        }
        ino inoVar = this.t;
        idk l = l();
        long currentTimeMillis = System.currentTimeMillis();
        long o = inoVar.o(R.string.f160520_resource_name_obfuscated_res_0x7f140651, 0L);
        long o2 = inoVar.o(R.string.f160540_resource_name_obfuscated_res_0x7f140653, 0L);
        if (o == 0) {
            inoVar.t(R.string.f160520_resource_name_obfuscated_res_0x7f140651, currentTimeMillis);
            l.e(bwa.USER_RETENTION, 0);
        } else if (currentTimeMillis - o2 >= TimeUnit.DAYS.toMillis(1L)) {
            double days = TimeUnit.MILLISECONDS.toDays(currentTimeMillis - o);
            Double.isNaN(days);
            double ceil = Math.ceil(days / 7.0d);
            int length = bwa.t.length;
            int min = Math.min((int) ceil, 6);
            bwa bwaVar = bwa.USER_RETENTION;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(bwa.t[min < 0 ? 0 : min - 1]);
            l.e(bwaVar, objArr);
        }
        inoVar.t(R.string.f160540_resource_name_obfuscated_res_0x7f140653, currentTimeMillis);
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("activation_source");
            if (!(obj2 instanceof hfl)) {
                return;
            }
            hfl hflVar = (hfl) obj2;
            this.j = hflVar;
            hfl hflVar2 = hfl.AUTOMATIC;
            int ordinal = hflVar.ordinal();
            if (ordinal == 0) {
                i = 3;
            } else if (ordinal == 3) {
                i = 1;
            } else if (ordinal != 6) {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard", "getActivationSource", 1212, "ClipboardKeyboard.java")).w("Unknown activation source %s.", hflVar);
                i = 0;
            } else {
                i = 2;
            }
            l().e(bwa.UI_OPEN, Integer.valueOf(i));
        }
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (!inoVar.x(R.string.f160550_resource_name_obfuscated_res_0x7f140654, false)) {
            eju.s();
            bwf.a();
            T();
            x(5, 0);
        } else {
            RecyclerView recyclerView = this.g;
            if (recyclerView != null) {
                recyclerView.setImportantForAccessibility(0);
            }
            bwc.b();
            View view = this.f;
            if (view != null) {
                view.setVisibility(8);
            }
            x(0, 0);
        }
        this.k = true;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        llp llpVar;
        bvx bvxVar = this.b;
        if (bvxVar != null) {
            bvxVar.m(false);
            this.b.l(null);
        }
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            bvfVar.j.c = null;
            ot otVar = bvfVar.o;
            if (otVar != null) {
                otVar.i(null);
                bvfVar.o = null;
            }
            RecyclerView recyclerView = bvfVar.k;
            if (recyclerView != null) {
                recyclerView.gI();
                bvfVar.k = null;
            }
            bvfVar.m = null;
            bvfVar.l = null;
            this.c = null;
        }
        PopupWindow popupWindow = this.i;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.i = null;
        }
        bwr bwrVar = this.e;
        if (bwrVar != null) {
            bwrVar.m();
            this.e = null;
        }
        if (this.l != null) {
            ovg.a();
            this.l = null;
        }
        eju.s();
        bwc.b();
        bwf.a();
        this.g = null;
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
            this.f = null;
        }
        if (!this.t.x(R.string.f160560_resource_name_obfuscated_res_0x7f140655, false) && (llpVar = this.d) != null) {
            bvi.d(this.u, llpVar);
            this.d = null;
        }
        this.h = null;
        this.j = null;
        l().e(bwa.UI_CLOSE, Integer.valueOf(1 ^ (this.k ? 1 : 0)));
        this.k = false;
        this.t.ae(this, R.string.f160550_resource_name_obfuscated_res_0x7f140654);
        super.h();
    }

    @Override // defpackage.bvc
    public final void i() {
        bvf bvfVar = this.c;
        int size = bvfVar != null ? bvfVar.h.size() : 0;
        bvf bvfVar2 = this.c;
        int i = bvfVar2 != null ? bvfVar2.i : 0;
        if (size == 0) {
            x(1, 0);
        } else if (i == 0) {
            x(2, size);
        } else {
            x(3, size);
        }
    }

    @Override // defpackage.bvc, defpackage.bwq
    public final void j(buk bukVar, boolean z) {
        int i;
        bui buiVar;
        llp llpVar;
        bvx bvxVar = this.b;
        if (bvxVar != null && (buiVar = ((bvt) bvxVar).b.k) != null && (llpVar = buiVar.g) != null && llpVar.contains(bukVar)) {
            buiVar.a(7);
        }
        CharSequence charSequence = bukVar.f;
        String i2 = charSequence == null ? bukVar.i() : charSequence.toString();
        int i3 = 2;
        if (!TextUtils.isEmpty(i2)) {
            this.v.z(hfd.d(new iay(-10009, iax.COMMIT, i2)));
            this.v.z(hfd.d(new iay(-10090, null, 0)));
            l().e(bwa.PASTE_ITEM_TYPE, Integer.valueOf(!bukVar.l()));
            bwg.b(this.D, l());
            bwg.a(this.u);
        } else {
            String j = bukVar.j();
            if (j == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard", "sendClipItemToApp", 853, "ClipboardKeyboard.java")).t("Both text and image uri are empty. Failed to send this clip item to app.");
            } else if (bwg.e(this.u, this.D, j, bukVar.e, l())) {
                idk l = l();
                bwa bwaVar = bwa.PASTE_ITEM_TYPE;
                Object[] objArr = new Object[1];
                if (bvu.l(this.u, j)) {
                    i = bukVar.l() ? 2 : 3;
                } else {
                    i = 4;
                }
                objArr[0] = Integer.valueOf(i);
                l.e(bwaVar, objArr);
            }
        }
        if (!bukVar.l()) {
            l().e(bwa.UNPINNED_ITEM_PASTE_TIME, Long.valueOf(System.currentTimeMillis() - bukVar.e));
        }
        hfl hflVar = this.j;
        if (hflVar != null) {
            int ordinal = hflVar.ordinal();
            if (ordinal != 3) {
                if (ordinal != 6) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard", "getPasteActionSourceCode", 1229, "ClipboardKeyboard.java")).w("Unknown activation source %s.", hflVar);
                    i3 = 0;
                } else {
                    i3 = z ? 3 : 5;
                }
            } else if (!z) {
                i3 = 4;
            }
            l().e(bwa.PASTE_ACTION_SOURCE, Integer.valueOf(i3));
        }
        this.k = true;
        if (z) {
            t(8);
        } else {
            Q(0);
        }
    }

    @Override // defpackage.bvc
    public final void k(buk bukVar, int i, View view, boolean z) {
        if (this.e == null && this.v.s() != null) {
            this.e = new bwr(this.u, this.v.s(), this);
        }
        View K = K();
        bwr bwrVar = this.e;
        if (bwrVar != null && K != null) {
            bwrVar.c();
            bwr bwrVar2 = this.e;
            bwrVar2.a = bukVar;
            bwrVar2.b = i;
            bwrVar2.c = view;
            bwrVar2.d = z;
            bwrVar2.l(K);
            ovg ovgVar = this.l;
            if (ovgVar != null && ovgVar.a) {
                ovg.a();
            }
            eju.s();
            bwr bwrVar3 = this.e;
            if (bwrVar3 != null) {
                bwrVar3.d(K);
            }
        }
        this.k = true;
        t(11);
    }

    public final idk l() {
        return this.v.hO();
    }

    @Override // defpackage.bwq
    public final void m(buk bukVar, int i) {
        O(bukVar, i, false);
    }

    public final void o() {
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            bvfVar.F();
        }
    }

    public final void t(int i) {
        l().e(bwa.TOP_LEVEL_OPERATION, Integer.valueOf(i));
    }

    @Override // defpackage.bwi
    public final void u(buk bukVar) {
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            if (!bvfVar.r) {
                bvfVar.F();
                return;
            }
            int indexOf = bvfVar.p.indexOf(bukVar);
            if (indexOf == -1) {
                this.c.E(bukVar);
                return;
            }
            bvf bvfVar2 = this.c;
            int indexOf2 = bvfVar2.p.indexOf(buk.a) + 1;
            if (indexOf2 > indexOf) {
                return;
            }
            bvfVar2.p.remove(indexOf);
            bvfVar2.p.add(indexOf2, bukVar);
            if (indexOf2 == indexOf) {
                bvfVar2.hg(indexOf2);
            } else {
                bvfVar2.hj(indexOf, indexOf2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void x(int r10, int r11) {
        /*
            r9 = this;
            long r0 = r9.B
            if (r10 == 0) goto Lc0
            r2 = 3
            r3 = 1
            if (r10 == r3) goto L6c
            r4 = 2
            r5 = 2132017404(0x7f1400fc, float:1.9673085E38)
            r6 = 0
            if (r10 == r4) goto L51
            if (r10 == r2) goto L36
            r11 = 5
            if (r10 == r11) goto L30
            ltg r10 = com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard.a
            hip r11 = defpackage.hip.a
            ltd r10 = r10.a(r11)
            r11 = 1085(0x43d, float:1.52E-42)
            java.lang.String r0 = "ClipboardKeyboard.java"
            java.lang.String r1 = "com/google/android/apps/inputmethod/libs/clipboard/ClipboardKeyboard"
            java.lang.String r2 = "setViewState"
            ltv r10 = r10.k(r1, r2, r11, r0)
            ltd r10 = (defpackage.ltd) r10
            java.lang.String r11 = "state are not defined in ClipboardStateType"
            r10.t(r11)
            return
        L30:
            long r10 = defpackage.iby.t
            r9.al(r0, r10)
            return
        L36:
            long r7 = defpackage.iby.r
            r9.al(r0, r7)
            android.support.v7.widget.AppCompatTextView r10 = r9.h
            if (r10 == 0) goto Lcf
            android.content.Context r0 = r9.u
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1[r6] = r11
            java.lang.String r11 = r0.getString(r5, r1)
            r10.setText(r11)
            return
        L51:
            long r7 = defpackage.iby.q
            r9.al(r0, r7)
            android.support.v7.widget.AppCompatTextView r10 = r9.h
            if (r10 == 0) goto Lcf
            android.content.Context r0 = r9.u
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1[r6] = r11
            java.lang.String r11 = r0.getString(r5, r1)
            r10.setText(r11)
            return
        L6c:
            android.content.Context r10 = r9.u
            android.view.View r11 = r9.K()
            hsz r3 = r9.v
            int r3 = r3.b()
            if (r11 != 0) goto L7b
            goto Lb0
        L7b:
            android.graphics.Point r4 = defpackage.bud.c(r11)
            r5 = 2130968589(0x7f04000d, float:1.7545836E38)
            int r5 = defpackage.jbt.e(r10, r5)
            int r6 = defpackage.gvv.d(r10)
            if (r3 != r2) goto La3
            android.content.res.Resources r10 = r10.getResources()
            r2 = 2131165614(0x7f0701ae, float:1.794545E38)
            int r10 = r10.getDimensionPixelOffset(r2)
            int r11 = r11.getHeight()
            int r6 = r6 - r11
            int r11 = r4.y
            int r6 = r6 - r11
            int r6 = r6 - r10
            if (r6 < r5) goto Lb0
            goto Lad
        La3:
            int r10 = r11.getHeight()
            int r6 = r6 - r10
            int r10 = r4.y
            int r6 = r6 - r10
            if (r6 < r5) goto Lb0
        Lad:
            long r10 = defpackage.iby.p
            goto Lb2
        Lb0:
            long r10 = defpackage.iby.u
        Lb2:
            r9.al(r0, r10)
            android.support.v7.widget.AppCompatTextView r10 = r9.h
            if (r10 == 0) goto Lcf
            r11 = 2132017403(0x7f1400fb, float:1.9673083E38)
            r10.setText(r11)
            return
        Lc0:
            r10 = 0
            r9.al(r0, r10)
            android.support.v7.widget.AppCompatTextView r10 = r9.h
            if (r10 == 0) goto Lcf
            r11 = 2132017402(0x7f1400fa, float:1.9673081E38)
            r10.setText(r11)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.clipboard.ClipboardKeyboard.x(int, int):void");
    }

    @Override // defpackage.bwq
    public final void v(int i) {
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            RecyclerView recyclerView = bvfVar.k;
            mo gA = recyclerView == null ? null : recyclerView.gA(i);
            if (gA != null) {
                gA.a.setVisibility(0);
            }
            bvfVar.t = false;
        }
        R(1.0f);
    }

    @Override // defpackage.bwq
    public final void w(int i) {
        bvf bvfVar = this.c;
        if (bvfVar != null) {
            RecyclerView recyclerView = bvfVar.k;
            mo gA = recyclerView == null ? null : recyclerView.gA(i);
            if (gA != null) {
                gA.a.setVisibility(4);
            }
        }
        R(0.05f);
        bwf.a();
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
