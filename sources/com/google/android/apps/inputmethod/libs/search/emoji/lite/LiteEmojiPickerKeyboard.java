package com.google.android.apps.inputmethod.libs.search.emoji.lite;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.Printer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiteEmojiPickerKeyboard extends LifecycleKeyboard implements View.OnLayoutChangeListener, gzv, hcg {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard");
    private static final ViewOutlineProvider c = new cpb();
    private static int d = 0;
    protected final ean a = ean.a();
    private final long e = SystemClock.elapsedRealtime();
    private final cpu f = cqh.a().b;
    private hci g;
    private dyz h;
    private RecyclerView i;
    private View j;
    private EmojiPickerBodyRecyclerView k;
    private View.OnTouchListener l;
    private KeyboardViewHolder m;

    public LiteEmojiPickerKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        int i = d + 1;
        d = i;
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "<init>", 93, "LiteEmojiPickerKeyboard.java")).u("Created (instance count = %s)", i);
        gzt.a.a(this);
        hyq.s(context);
    }

    private final void N(hei heiVar, boolean z) {
        hsz hszVar = this.v;
        if (hszVar == null || this.f == null) {
            return;
        }
        hszVar.z(hfd.d(new iay(-10027, iax.COMMIT, heiVar.b)));
        idk hO = this.v.hO();
        ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
        Object[] objArr = new Object[2];
        objArr[0] = heiVar.b;
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
        mbcVar2.a = 2 | mbcVar2.a;
        nfh t2 = mbb.g.t();
        int i = heiVar.d;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar = (mbb) t2.b;
        mbbVar.a |= 4;
        mbbVar.d = i;
        mba L = L(heiVar.d);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar2 = (mbb) t2.b;
        mbbVar2.e = L.e;
        mbbVar2.a |= 8;
        mbb mbbVar3 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbbVar3.getClass();
        mbcVar3.e = mbbVar3;
        mbcVar3.a |= 8;
        nfh t3 = mdl.h.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mdl mdlVar = (mdl) t3.b;
        mdlVar.b = 1;
        int i2 = mdlVar.a | 1;
        mdlVar.a = i2;
        mdlVar.a = i2 | 4;
        mdlVar.d = z;
        mdl mdlVar2 = (mdl) t3.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mdlVar2.getClass();
        mbcVar4.k = mdlVar2;
        mbcVar4.a |= 2048;
        objArr[1] = t.cz();
        hO.e(ctdVar, objArr);
        this.f.c(heiVar.b);
    }

    private final void O(boolean z) {
        View view;
        if (itb.k() && (view = this.j) != null) {
            view.setElevation(z ? this.u.getResources().getDimensionPixelSize(R.dimen.f36470_resource_name_obfuscated_res_0x7f0702d1) : 0.0f);
        }
    }

    private final void P() {
        KeyboardViewHolder keyboardViewHolder = this.m;
        if (keyboardViewHolder == null || this.g == null) {
            return;
        }
        this.g.g(keyboardViewHolder.getLayoutParams().width > 0 ? this.m.getWidth() / this.m.getLayoutParams().width : 1.0f);
    }

    @Override // defpackage.hbq
    public final boolean A(View view) {
        return false;
    }

    @Override // defpackage.hcg
    public final void H(int i, int i2) {
        fp(iby.o, false);
        fp(((Long) iby.K.get(i)).longValue(), true);
        ieh j = ieh.j();
        ctd ctdVar = ctd.CATEGORY_SWITCH;
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
        nfh t2 = mbb.g.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar = (mbb) t2.b;
        int i3 = mbbVar.a | 4;
        mbbVar.a = i3;
        mbbVar.d = i;
        mbbVar.c = i2 - 1;
        mbbVar.a = i3 | 2;
        mba L = L(i);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbb mbbVar2 = (mbb) t2.b;
        mbbVar2.e = L.e;
        mbbVar2.a |= 8;
        mbb mbbVar3 = (mbb) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbbVar3.getClass();
        mbcVar3.e = mbbVar3;
        mbcVar3.a |= 8;
        objArr[0] = t.cz();
        j.e(ctdVar, objArr);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.C;
        printer.println("isActive = " + z2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.e;
        printer.println("instanceLifeTime(ms) = " + (elapsedRealtime - j));
        int i = d;
        printer.println("instanceCreationCount = " + i);
        printer.println("flags = ".concat(String.valueOf(String.valueOf(this.a))));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onKeyboardViewDiscarded", 253, "LiteEmojiPickerKeyboard.java")).G("onKeyboardViewDiscarded(), type=%s, %s", icfVar.b, this);
        this.l = null;
        this.j = null;
        this.m = null;
        this.i = null;
        this.k = null;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onKeyboardViewCreated", 100, "LiteEmojiPickerKeyboard.java")).J("onKeyboardViewCreated(), type=%s, view=%s, %s", icfVar.b, softKeyboardView, this);
        if (icfVar.b == ice.HEADER) {
            this.i = (RecyclerView) softKeyboardView.findViewById(R.id.f54240_resource_name_obfuscated_res_0x7f0b018c);
        } else if (icfVar.b != ice.BODY) {
        } else {
            this.k = (EmojiPickerBodyRecyclerView) softKeyboardView.findViewById(R.id.f54280_resource_name_obfuscated_res_0x7f0b0190);
            this.l = softKeyboardView;
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        int integer;
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView;
        super.g(editorInfo, obj);
        ltg ltgVar = b;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onActivate", 161, "LiteEmojiPickerKeyboard.java")).w("onActivate(), %s", this);
        if (cuz.a.c(this.u)) {
            integer = this.u.getResources().getInteger(R.integer.f132790_resource_name_obfuscated_res_0x7f0c0139);
        } else {
            integer = this.u.getResources().getInteger(R.integer.f131250_resource_name_obfuscated_res_0x7f0c0024);
        }
        hbx a = hby.a();
        a.g(integer / 10.0f);
        a.d();
        hby a2 = a.a();
        hcj a3 = hck.a();
        a3.a = llp.r(new eap(this.u, 0));
        a3.b(false);
        hck a4 = a3.a();
        RecyclerView recyclerView = this.i;
        if (recyclerView == null || (emojiPickerBodyRecyclerView = this.k) == null) {
            ((ltd) ltgVar.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onActivate", 179, "LiteEmojiPickerKeyboard.java")).t("Header view and body view must be initialized.");
            return;
        }
        this.g = new hci(recyclerView, emojiPickerBodyRecyclerView, this, hcm.a().d(), a2, a4);
        KeyboardViewHolder x = x(this.k);
        this.m = x;
        if (x != null) {
            x.addOnLayoutChangeListener(this);
        } else {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onActivate", 197, "LiteEmojiPickerKeyboard.java")).t("bodyViewHolder is null, not limiting the left and right boundary of the popup view showing position.");
        }
        P();
        hci hciVar = this.g;
        hciVar.A = this.m;
        hciVar.d();
        KeyboardViewHolder x2 = x(this.i);
        this.j = x2;
        if (x2 == null) {
            return;
        }
        x2.addOnLayoutChangeListener(this);
        this.j.setOutlineProvider(c);
        this.j.setElevation(0.0f);
        this.t.j("PREF_LAST_ACTIVE_TAB", IEmojiSearchExtension.class.getName());
        hfl g = dip.g(obj, hfl.EXTERNAL);
        View X = X(ice.BODY);
        if (X == null) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "prepareAndRunCorpusChangeAnimation", 294, "LiteEmojiPickerKeyboard.java")).t("Container view is null, cannot run corpus selector animation.");
        } else {
            if (this.h == null) {
                this.h = new dyx(this.u);
            }
            this.h.a(X, R.id.key_pos_non_prime_category_1);
        }
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
        int a5 = cte.a(g);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbcVar3.d = a5 - 1;
        mbcVar3.a |= 4;
        objArr[0] = t.cz();
        hO.e(ctdVar, objArr);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "LiteEmojiPickerKeyboard";
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/search/emoji/lite/LiteEmojiPickerKeyboard", "onDeactivate", 234, "LiteEmojiPickerKeyboard.java")).w("onDeactivate(), %s", this);
        hci hciVar = this.g;
        if (hciVar != null) {
            hciVar.e();
            this.g = null;
        }
        View view = this.j;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
            O(false);
            this.j = null;
        }
        KeyboardViewHolder keyboardViewHolder = this.m;
        if (keyboardViewHolder != null) {
            keyboardViewHolder.removeOnLayoutChangeListener(this);
            this.m = null;
        }
        super.h();
    }

    @Override // defpackage.hbq
    public final /* synthetic */ void hx() {
    }

    @Override // defpackage.hcg
    public final void l(int i, int i2) {
        O(i > 0);
    }

    @Override // defpackage.hcg
    public final void m() {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        if ((i2 != i6 || i4 != i8) && (view2 = this.j) != null) {
            view2.invalidateOutline();
        }
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        P();
    }

    @Override // defpackage.hbq
    public final void t(hei heiVar) {
        N(heiVar, false);
    }

    @Override // defpackage.hbq
    public final void u(hei heiVar) {
        N(heiVar, true);
    }

    @Override // defpackage.hbq
    public final void w(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.l;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
    }

    private final mba L(int i) {
        return (this.g == null || !hci.k(i)) ? mba.UNKNOWN : mba.RECENTS;
    }
}
