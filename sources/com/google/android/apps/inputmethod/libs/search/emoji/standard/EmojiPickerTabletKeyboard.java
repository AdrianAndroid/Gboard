package com.google.android.apps.inputmethod.libs.search.emoji.standard;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Printer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.expression.navbar.FixedHeightNavigationRow;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Collection$EL;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiPickerTabletKeyboard extends LifecycleKeyboard implements View.OnLayoutChangeListener, gzv, hcg, dzt {
    private static final ltg g = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard");
    private static int h = 0;
    public EmojiPickerBodyRecyclerView b;
    public AppCompatTextView c;
    public EmojiPickerBodyRecyclerView d;
    public ViewGroup e;
    public String f;
    private final eaw j;
    private hci k;
    private RecyclerView l;
    private View.OnTouchListener m;
    private KeyboardViewHolder n;
    private SoftKeyboardView o;
    private hbs p;
    private final eac q;
    private dxe r;
    protected final ean a = ean.a();
    private final long i = SystemClock.elapsedRealtime();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerTabletKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        eaw eawVar = new eaw(hszVar, context);
        int i = h + 1;
        h = i;
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "<init>", 136, "EmojiPickerTabletKeyboard.java")).u("Created (instance count = %s)", i);
        gzt.a.a(this);
        this.j = eawVar;
        hyq.s(context);
        this.q = new eac(context, hszVar);
    }

    private final void N() {
        KeyboardViewHolder keyboardViewHolder = this.n;
        if (keyboardViewHolder == null || this.k == null) {
            return;
        }
        this.k.g(keyboardViewHolder.getLayoutParams().width > 0 ? this.n.getWidth() / this.n.getLayoutParams().width : 1.0f);
    }

    private final boolean O() {
        String str = this.f;
        return (str == null || str.isEmpty() || this.c == null || this.d == null) ? false : true;
    }

    @Override // defpackage.hbq
    public final boolean A(View view) {
        return false;
    }

    @Override // defpackage.hcg
    public final void H(int i, int i2) {
        this.j.g(this, i, i2, this.k);
    }

    @Override // defpackage.dzt
    public final void K(dat datVar) {
        eac eacVar = this.q;
        if (eacVar != null) {
            eacVar.g(datVar);
        }
    }

    @Override // defpackage.dzt
    public final void L(eab eabVar) {
        eac eacVar = this.q;
        if (eacVar != null) {
            eacVar.j(eabVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "consumeEvent", 328, "EmojiPickerTabletKeyboard.java")).w("consumeEvent: %s", hfdVar);
        iay f = hfdVar.f();
        if (f == null || f.c != -10004) {
            return super.c(hfdVar);
        }
        this.v.z(cnx.d(this.u, f, dip.j(lfd.d(this.f), hfl.EXTERNAL)));
        return true;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        eac eacVar = this.q;
        if (eacVar != null) {
            eacVar.b();
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.i;
        printer.println("instanceLifeTime(ms) = " + (elapsedRealtime - j));
        int i = h;
        printer.println("instanceCreationCount = " + i);
        printer.println("flags = ".concat(String.valueOf(String.valueOf(this.a))));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onKeyboardViewDiscarded", 367, "EmojiPickerTabletKeyboard.java")).G("onKeyboardViewDiscarded(), type=%s, %s", icfVar.b, this);
        if (icfVar.b == ice.BODY) {
            this.m = null;
            this.n = null;
            this.o = null;
            this.b = null;
            this.l = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.r = null;
        }
        eac eacVar = this.q;
        if (eacVar != null) {
            eacVar.f(icfVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onKeyboardViewCreated", 155, "EmojiPickerTabletKeyboard.java")).J("onKeyboardViewCreated(), type=%s, view=%s, %s", icfVar.b, softKeyboardView, this);
        if (icfVar.b == ice.BODY) {
            this.l = (RecyclerView) softKeyboardView.findViewById(R.id.f52870_resource_name_obfuscated_res_0x7f0b00e1);
            this.b = (EmojiPickerBodyRecyclerView) softKeyboardView.findViewById(R.id.f54280_resource_name_obfuscated_res_0x7f0b0190);
            this.o = softKeyboardView;
            this.m = softKeyboardView;
            View findViewById = softKeyboardView.findViewById(R.id.f54670_resource_name_obfuscated_res_0x7f0b01ba);
            if (findViewById instanceof FixedHeightNavigationRow) {
                ((FixedHeightNavigationRow) findViewById).b();
            }
            RecyclerView recyclerView = this.l;
            if (recyclerView != null) {
                recyclerView.s(new eax(this));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) softKeyboardView.findViewById(R.id.f52840_resource_name_obfuscated_res_0x7f0b00de);
            this.c = appCompatTextView;
            if (appCompatTextView != null) {
                if (!this.x.A) {
                    appCompatTextView.setVisibility(8);
                    this.c = null;
                } else {
                    appCompatTextView.setHint(this.u.getString(R.string.f150910_resource_name_obfuscated_res_0x7f1401d1));
                    this.d = (EmojiPickerBodyRecyclerView) softKeyboardView.findViewById(R.id.f54300_resource_name_obfuscated_res_0x7f0b0192);
                    this.e = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
                    this.r = new dxe();
                    this.c.setOnClickListener(new dwx(this, 14));
                }
            }
            ctp.a(softKeyboardView, R.string.f152760_resource_name_obfuscated_res_0x7f14029f);
            if (this.q == null) {
                return;
            }
            if (jam.r(this.u)) {
                this.q.e(softKeyboardView, icfVar, new EmojiPickerLayoutManager(this.u.getResources().getInteger(R.integer.f131240_resource_name_obfuscated_res_0x7f0c0023)), new eav(this, 2));
                return;
            }
            this.q.e(softKeyboardView, icfVar, null, new eav(this, 3));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView;
        super.g(editorInfo, obj);
        ltg ltgVar = g;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onActivate", 260, "EmojiPickerTabletKeyboard.java")).w("onActivate(), %s", this);
        ozd a = hcm.a();
        a.a = 2;
        hcm d = a.d();
        hby a2 = this.j.a(this.o);
        hck b = this.j.b();
        RecyclerView recyclerView = this.l;
        if (recyclerView == null || (emojiPickerBodyRecyclerView = this.b) == null) {
            ((ltd) ltgVar.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onActivate", 271, "EmojiPickerTabletKeyboard.java")).t("Header view and body view must be initialized.");
            return;
        }
        this.k = new hci(recyclerView, emojiPickerBodyRecyclerView, this, d, a2, b);
        KeyboardViewHolder x = x(this.b);
        this.n = x;
        if (x != null) {
            x.addOnLayoutChangeListener(this);
        } else {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onActivate", 289, "EmojiPickerTabletKeyboard.java")).t("bodyViewHolder is null, not limiting the left and right boundary of the popup view showing position.");
        }
        N();
        hci hciVar = this.k;
        hciVar.A = this.n;
        hciVar.d();
        this.j.c(this.t, this.a, X(ice.BODY));
        hfl g2 = dip.g(obj, hfl.EXTERNAL);
        this.f = dip.l(obj);
        if (O() && this.d != null) {
            Context context = this.u;
            haz a3 = hba.a();
            a3.c();
            a3.b();
            this.p = new hbs(has.a(context, a3.a()), new eap(this.u, 0), this, this.d, new hbu((int) this.u.getResources().getDimension(R.dimen.f33090_resource_name_obfuscated_res_0x7f07010d), this.a.g));
            String str = this.f;
            if (str != null) {
                llp r = llp.r(str);
                this.r.g(this.u);
                EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView2 = this.b;
                if (emojiPickerBodyRecyclerView2 != null) {
                    emojiPickerBodyRecyclerView2.setVisibility(8);
                }
                if (!this.r.f(r).isEmpty()) {
                    llp f = this.r.f(r);
                    ViewGroup viewGroup = this.e;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView3 = this.d;
                    if (emojiPickerBodyRecyclerView3 != null) {
                        emojiPickerBodyRecyclerView3.setVisibility(0);
                    }
                    hbs hbsVar = this.p;
                    if (hbsVar != null) {
                        llp llpVar = (llp) Collection$EL.stream(f).map(dwn.n).collect(ljr.a);
                        hiz b2 = hbsVar.c.b();
                        afp afpVar = afp.STARTED;
                        boolean z = jam.b;
                        llk e = llp.e();
                        llk e2 = llp.e();
                        llk e3 = llp.e();
                        e.h(new eii(hbsVar, llpVar, 6));
                        e2.h(new eii(hbsVar, llpVar, 7));
                        b2.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
                    }
                    AppCompatTextView appCompatTextView = this.c;
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(this.f);
                    }
                    if (this.f != null) {
                        idk hO = this.v.hO();
                        ctd ctdVar = ctd.TAB_OPEN;
                        Object[] objArr = new Object[1];
                        nfh t = mbc.p.t();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mbc mbcVar = (mbc) t.b;
                        mbcVar.b = 1;
                        mbcVar.a |= 1;
                        mbc mbcVar2 = (mbc) t.b;
                        mbcVar2.c = 2;
                        int i = mbcVar2.a | 2;
                        mbcVar2.a = i;
                        String str2 = this.f;
                        str2.getClass();
                        mbcVar2.a = i | 1024;
                        mbcVar2.j = str2;
                        int a4 = cte.a(g2);
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mbc mbcVar3 = (mbc) t.b;
                        mbcVar3.d = a4 - 1;
                        mbcVar3.a |= 4;
                        objArr[0] = t.cz();
                        hO.e(ctdVar, objArr);
                    }
                    f.size();
                } else {
                    EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView4 = this.d;
                    if (emojiPickerBodyRecyclerView4 != null) {
                        emojiPickerBodyRecyclerView4.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = this.e;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                    }
                    cnf a5 = cng.a();
                    a5.e(1);
                    a5.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
                    a5.f(R.string.f158990_resource_name_obfuscated_res_0x7f14058c);
                    a5.a().b(this.u, this.e);
                    ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "displayErrorCard", 586, "EmojiPickerTabletKeyboard.java")).t("No results found");
                }
                this.r.h();
            }
            idk hO2 = this.v.hO();
            ctd ctdVar2 = ctd.TAB_OPEN;
            Object[] objArr2 = new Object[1];
            nfh t2 = mbc.p.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar4 = (mbc) t2.b;
            mbcVar4.b = 1;
            mbcVar4.a |= 1;
            mbc mbcVar5 = (mbc) t2.b;
            mbcVar5.c = 1;
            mbcVar5.a |= 2;
            int a6 = cte.a(g2);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar6 = (mbc) t2.b;
            mbcVar6.d = a6 - 1;
            mbcVar6.a |= 4;
            int f2 = ffb.q().f();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mbc mbcVar7 = (mbc) t2.b;
            mbcVar7.m = f2 - 1;
            mbcVar7.a |= 8192;
            objArr2[0] = t2.cz();
            hO2.e(ctdVar2, objArr2);
        }
        eac eacVar = this.q;
        if (eacVar == null) {
            return;
        }
        eacVar.k(this, editorInfo, true);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "EmojiPickerKeyboard";
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerTabletKeyboard", "onDeactivate", 343, "EmojiPickerTabletKeyboard.java")).w("onDeactivate(), %s", this);
        fp(iby.o, false);
        hci hciVar = this.k;
        if (hciVar != null) {
            hciVar.e();
            this.k = null;
        }
        KeyboardViewHolder keyboardViewHolder = this.n;
        if (keyboardViewHolder != null) {
            keyboardViewHolder.removeOnLayoutChangeListener(this);
            this.n = null;
        }
        hbs hbsVar = this.p;
        if (hbsVar != null) {
            hbsVar.close();
        }
        this.j.f();
        eac eacVar = this.q;
        if (eacVar != null) {
            eacVar.d();
        }
        super.h();
    }

    @Override // defpackage.hbq
    public final /* synthetic */ void hx() {
    }

    @Override // defpackage.hcg
    public final void l(int i, int i2) {
    }

    @Override // defpackage.hcg
    public final void m() {
        this.j.e();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        N();
    }

    @Override // defpackage.hbq
    public final void t(hei heiVar) {
        this.j.d(this.k, heiVar, false, O(), this.f);
    }

    @Override // defpackage.hbq
    public final void u(hei heiVar) {
        this.j.d(this.k, heiVar, true, O(), this.f);
    }

    @Override // defpackage.hbq
    public final void w(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.m;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
    }
}
