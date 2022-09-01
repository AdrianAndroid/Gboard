package com.google.android.apps.inputmethod.libs.search.emoji.standard;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.Printer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.expression.navbar.FixedHeightNavigationRow;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiPickerKeyboard extends LifecycleKeyboard implements View.OnLayoutChangeListener, gzv, hcg, dzt {
    public static final /* synthetic */ int c = 0;
    protected final ean b = ean.a();
    private final long f = SystemClock.elapsedRealtime();
    private final eaw g;
    private final boolean h;
    private hci i;
    private eac j;
    private RecyclerView k;
    private EmojiPickerBodyRecyclerView l;
    private View.OnTouchListener m;
    private KeyboardViewHolder n;
    private SoftKeyboardView o;
    private cou p;
    private boe q;
    static final hhl a = hhq.f("emoji_max_index_for_open_search_box", 3);
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard");
    private static int e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiPickerKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        eaw eawVar = new eaw(hszVar, context);
        int i = e + 1;
        e = i;
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "<init>", 120, "EmojiPickerKeyboard.java")).u("Created (instance count = %s)", i);
        gzt.a.a(this);
        this.g = eawVar;
        hyq.s(context);
        boolean booleanValue = ((Boolean) iho.a(context).c()).booleanValue();
        this.h = booleanValue;
        if (booleanValue) {
            this.j = new eac(context, hszVar);
        }
    }

    private final int N() {
        return this.h ? R.string.f163280_resource_name_obfuscated_res_0x7f14077e : R.string.f150910_resource_name_obfuscated_res_0x7f1401d1;
    }

    private final int O(View view) {
        int f;
        if (view == null) {
            return 0;
        }
        Resources resources = this.u.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f42220_resource_name_obfuscated_res_0x7f07069d);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f37100_resource_name_obfuscated_res_0x7f070322);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            f = ((ViewGroup) parent).getMeasuredWidth();
        } else {
            ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "getHorizontalSpaceWithCollapsedStartElement", 491, "EmojiPickerKeyboard.java")).t("getHorizontalSpaceWithCollapsedStartElement() : Cannot find parent's parent.");
            f = gvv.f(view.getContext());
        }
        int paddingLeft = (f - view.getPaddingLeft()) - view.getPaddingRight();
        return this.h ? paddingLeft : (paddingLeft - dimensionPixelSize) - dimensionPixelSize2;
    }

    private final void P() {
        KeyboardViewHolder keyboardViewHolder = this.n;
        if (keyboardViewHolder == null || this.i == null) {
            return;
        }
        this.i.g(keyboardViewHolder.getLayoutParams().width > 0 ? this.n.getWidth() / this.n.getLayoutParams().width : 1.0f);
    }

    private final boolean Q() {
        return this.x.A;
    }

    @Override // defpackage.hbq
    public final boolean A(View view) {
        return false;
    }

    @Override // defpackage.hcg
    public final void H(int i, int i2) {
        this.g.g(this, i, i2, this.i);
    }

    @Override // defpackage.dzt
    public final void K(dat datVar) {
        eac eacVar = this.j;
        if (eacVar != null) {
            eacVar.g(datVar);
        }
    }

    @Override // defpackage.dzt
    public final void L(eab eabVar) {
        eac eacVar = this.j;
        if (eacVar != null) {
            eacVar.j(eabVar);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        eac eacVar = this.j;
        if (eacVar != null) {
            eacVar.b();
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f;
        printer.println("instanceLifeTime(ms) = " + (elapsedRealtime - j));
        int i = e;
        printer.println("instanceCreationCount = " + i);
        printer.println("flags = ".concat(String.valueOf(String.valueOf(this.b))));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onKeyboardViewDiscarded", 324, "EmojiPickerKeyboard.java")).G("onKeyboardViewDiscarded(), type=%s, %s", icfVar.b, this);
        if (icfVar.b == ice.BODY) {
            this.m = null;
            this.n = null;
            this.o = null;
            this.l = null;
        } else if (icfVar.b == ice.HEADER) {
            this.p = null;
            this.q = null;
            this.k = null;
        }
        eac eacVar = this.j;
        if (eacVar != null) {
            eacVar.f(icfVar);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onKeyboardViewCreated", 152, "EmojiPickerKeyboard.java")).J("onKeyboardViewCreated(), type=%s, view=%s, %s", icfVar.b, softKeyboardView, this);
        if (icfVar.b == ice.HEADER) {
            this.k = (RecyclerView) softKeyboardView.findViewById(R.id.keyboard_expression_header_middle_element_container);
            this.p = new cou(softKeyboardView, new eaq(this.u, this.v, cqg.f));
            if (this.h) {
                this.q = new boe(this.u, softKeyboardView, 2);
                boe.i(softKeyboardView, R.string.f152760_resource_name_obfuscated_res_0x7f14029f);
            }
        } else if (icfVar.b == ice.BODY) {
            this.o = softKeyboardView;
            this.l = (EmojiPickerBodyRecyclerView) softKeyboardView.findViewById(R.id.f54280_resource_name_obfuscated_res_0x7f0b0190);
            this.m = softKeyboardView;
            ((FixedHeightNavigationRow) softKeyboardView.findViewById(R.id.f54670_resource_name_obfuscated_res_0x7f0b01ba)).b();
        }
        eac eacVar = this.j;
        if (eacVar != null) {
            eacVar.e(softKeyboardView, icfVar, null, new eav(this, 0));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView;
        emv a2;
        super.g(editorInfo, obj);
        ltg ltgVar = d;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onActivate", 230, "EmojiPickerKeyboard.java")).w("onActivate(), %s", this);
        this.g.c(this.t, this.b, X(ice.BODY));
        hby a3 = this.g.a(this.o);
        hck b = this.g.b();
        RecyclerView recyclerView = this.k;
        if (recyclerView == null || (emojiPickerBodyRecyclerView = this.l) == null) {
            ((ltd) ltgVar.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onActivate", 238, "EmojiPickerKeyboard.java")).t("Header view and body view must be initialized.");
            return;
        }
        this.i = new hci(recyclerView, emojiPickerBodyRecyclerView, this, hcm.a().d(), a3, b);
        KeyboardViewHolder x = x(this.l);
        this.n = x;
        if (x != null) {
            x.addOnLayoutChangeListener(this);
        } else {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onActivate", 256, "EmojiPickerKeyboard.java")).t("bodyViewHolder is null, not limiting the left and right boundary of the popup view showing position.");
        }
        P();
        hci hciVar = this.i;
        hciVar.A = this.n;
        hciVar.h(O(this.k));
        this.i.d();
        if (X(ice.HEADER) != null) {
            int intValue = ((Long) a.c()).intValue();
            cou couVar = this.p;
            if (couVar != null) {
                cpc a4 = cpd.a();
                a4.b = 2;
                a4.d(Q());
                a4.c(false);
                a4.b(intValue);
                couVar.g(a4.a());
            }
            long j = this.B & iby.o;
            int indexOf = iby.K.indexOf(Long.valueOf(j));
            if (indexOf == -1) {
                if ((iby.o & j) != j) {
                    ((ltd) ltgVar.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "getHeaderIndexFromStates", 144, "EmojiPickerKeyboard.java")).t("categoryState must be included in STATE_ALL_SUB_CATEGORY");
                }
                indexOf = -1;
            }
            if (!Q()) {
                a2 = cov.a();
            } else if (indexOf <= intValue) {
                cog.c();
                a2 = cog.h(R.string.f152770_resource_name_obfuscated_res_0x7f1402a0, N());
            } else {
                emv a5 = cov.a();
                cog.c();
                int N = N();
                osr a6 = coq.a();
                a6.u(col.IMAGE_RESOURCE);
                a6.e = cok.a(-10001);
                a6.a = cop.a(N);
                czp a7 = com.a();
                a7.i(R.drawable.f50590_resource_name_obfuscated_res_0x7f080363);
                a7.h(R.string.f152770_resource_name_obfuscated_res_0x7f1402a0);
                a7.c = 2;
                a6.c = a7.f();
                a5.d = a6.t();
                a2 = a5;
            }
            a2.j(cox.b(indexOf));
            cou couVar2 = this.p;
            if (couVar2 != null) {
                couVar2.k(a2.h());
            }
        }
        hfl g = dip.g(obj, hfl.EXTERNAL);
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
        mbcVar2.c = 1;
        mbcVar2.a |= 2;
        int a8 = cte.a(g);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbcVar3.d = a8 - 1;
        mbcVar3.a |= 4;
        int f = ffb.q().f();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mbcVar4.m = f - 1;
        mbcVar4.a |= 8192;
        objArr[0] = t.cz();
        hO.e(ctdVar, objArr);
        eac eacVar = this.j;
        if (eacVar == null) {
            return;
        }
        eacVar.k(this, editorInfo, false);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "EmojiPickerKeyboard";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void gl(long j, long j2) {
        super.gl(j, j2);
        int indexOf = iby.K.indexOf(Long.valueOf(j2 & iby.o));
        int indexOf2 = iby.K.indexOf(Long.valueOf(j & iby.o));
        if (indexOf < 0 || indexOf == indexOf2) {
            return;
        }
        cou couVar = this.p;
        if (couVar != null) {
            couVar.i(cox.b(indexOf));
        }
        boe boeVar = this.q;
        if (boeVar == null) {
            return;
        }
        boeVar.l(indexOf);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        ((ltd) ((ltd) d.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiPickerKeyboard", "onDeactivate", 298, "EmojiPickerKeyboard.java")).w("onDeactivate(), %s", this);
        fp(iby.o, false);
        hci hciVar = this.i;
        if (hciVar != null) {
            hciVar.e();
            this.i = null;
        }
        cou couVar = this.p;
        if (couVar != null) {
            couVar.h();
        }
        KeyboardViewHolder keyboardViewHolder = this.n;
        if (keyboardViewHolder != null) {
            keyboardViewHolder.removeOnLayoutChangeListener(this);
            this.n = null;
        }
        this.g.f();
        boe boeVar = this.q;
        if (boeVar != null) {
            boeVar.j();
        }
        eac eacVar = this.j;
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
        boolean z = i > 0;
        cou couVar = this.p;
        if (couVar != null) {
            couVar.j(z);
        }
    }

    @Override // defpackage.hcg
    public final void m() {
        this.g.e();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        hci hciVar;
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            P();
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView == null || (hciVar = this.i) == null) {
            return;
        }
        hciVar.h(O(recyclerView));
    }

    @Override // defpackage.hbq
    public final void t(hei heiVar) {
        this.g.d(this.i, heiVar, false, false, null);
    }

    @Override // defpackage.hbq
    public final void u(hei heiVar) {
        this.g.d(this.i, heiVar, true, false, null);
    }

    @Override // defpackage.hbq
    public final void w(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.m;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
    }
}
