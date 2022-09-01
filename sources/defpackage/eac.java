package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerLayoutManager;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.function.BooleanSupplier;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: eac  reason: default package */
/* loaded from: classes.dex */
public final class eac {
    private static final ltg o = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionUiController");
    private final dzl A;
    public final Context b;
    public final hsz c;
    public EditorInfo d;
    public LifecycleKeyboard e;
    public BindingRecyclerView f;
    public View g;
    public AppCompatTextView h;
    public AppCompatTextView i;
    public ImageView j;
    public bfc k;
    public bfc l;
    public final dzx n;
    private final cuj t;
    private View u;
    private ViewGroup v;
    private View w;
    private ImageView x;
    private BooleanSupplier y;
    private final ijj p = new ckp(this, 6);
    private final ijj r = new ckp(this, 7);
    public final AtomicReference a = new AtomicReference(mdi.UNKNOWN);
    private final hiw s = new hiw(new dvd(this, 19));
    private boolean z = false;
    public dat m = dat.a;
    private final long q = ((Long) dzn.i.c()).longValue();

    public eac(Context context, hsz hszVar) {
        this.b = context;
        this.c = hszVar;
        dzl dzlVar = new dzl(context, hszVar.hO());
        this.A = dzlVar;
        this.t = dzlVar.h;
        hszVar.hO();
        this.n = new dzx(context);
    }

    public static void h(AppCompatTextView appCompatTextView, String str) {
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    public static void i(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private static void l(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a(mdi mdiVar) {
        mdj mdjVar;
        LifecycleKeyboard lifecycleKeyboard;
        BooleanSupplier booleanSupplier = this.y;
        if (booleanSupplier == null || booleanSupplier.getAsBoolean()) {
            mdi mdiVar2 = (mdi) this.a.getAndSet(mdiVar);
            if (mdiVar != mdi.NO_SUGGESTIONS_ERROR || (lifecycleKeyboard = this.e) == null) {
                this.s.a();
            } else {
                this.s.c(lifecycleKeyboard, this.q);
            }
            if (mdiVar2 == mdiVar) {
                return;
            }
            i(this.w, 8);
            int ordinal = mdiVar.ordinal();
            if (ordinal == 1) {
                i(this.f, 4);
                this.A.b();
                LifecycleKeyboard lifecycleKeyboard2 = this.e;
                if (lifecycleKeyboard2 == null) {
                    return;
                }
                dzl dzlVar = this.A;
                gku gkuVar = new gku(this, 1);
                hiz a = dzlVar.g.a();
                afp afpVar = afp.DESTROYED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new bqx(dzlVar, gkuVar, 5));
                e2.h(new dys(gkuVar, 3));
                a.E(hjg.a(gyc.b, lifecycleKeyboard2, afp.CREATED, z, e, e2, e3));
                return;
            } else if (ordinal == 2) {
                i(this.i, 8);
                i(this.g, 8);
                i(this.j, 0);
                i(this.f, 4);
                h(this.h, this.b.getString(R.string.f154220_resource_name_obfuscated_res_0x7f140353));
                bfc bfcVar = this.k;
                if (bfcVar != null) {
                    hjq.a(this.b).g(eaa.a).s(bfcVar);
                }
                bfc bfcVar2 = this.l;
                if (bfcVar2 != null) {
                    hjq.a(this.b).g(eaa.c).s(bfcVar2);
                }
                c();
                c();
                return;
            } else if (ordinal == 3) {
                gqa.a(this.b).h(R.string.f159040_resource_name_obfuscated_res_0x7f14059a);
                i(this.i, 8);
                i(this.g, 8);
                i(this.j, 8);
                i(this.f, 4);
                this.A.b();
                h(this.h, this.b.getString(R.string.f159040_resource_name_obfuscated_res_0x7f14059a));
                bfc bfcVar3 = this.l;
                if (bfcVar3 != null) {
                    hjq.a(this.b).g(eaa.d).s(bfcVar3);
                }
                hjq.a(this.b).l(this.k);
                c();
                return;
            } else if (ordinal == 4) {
                boolean b = irv.b();
                gqa a2 = gqa.a(this.b);
                int i = R.string.f162980_resource_name_obfuscated_res_0x7f140756;
                a2.h(R.string.f162980_resource_name_obfuscated_res_0x7f140756);
                if (!b) {
                    gqa.a(this.b).h(R.string.f152930_resource_name_obfuscated_res_0x7f1402b0);
                }
                i(this.i, 0);
                i(this.g, 8);
                i(this.j, 8);
                i(this.f, 4);
                this.A.b();
                AppCompatTextView appCompatTextView = this.h;
                Context context = this.b;
                if (true != b) {
                    i = R.string.f152930_resource_name_obfuscated_res_0x7f1402b0;
                }
                h(appCompatTextView, context.getString(i));
                hjq.a(this.b).l(this.k);
                hjq.a(this.b).l(this.l);
                c();
                return;
            } else if (ordinal != 5) {
                return;
            } else {
                this.c.h().e(R.string.f148160_resource_name_obfuscated_res_0x7f140060);
                hjq.a(this.b).l(this.k);
                hjq.a(this.b).l(this.l);
                i(this.f, 0);
                boolean z2 = !this.t.H();
                dau.i(z2, "BindingAdapter unexpectedly empty");
                if (!z2) {
                    return;
                }
                dzl dzlVar2 = this.A;
                llp llpVar = (llp) dzlVar2.h.y().map(dwn.c).filter(dzj.a).map(dwn.d).collect(ljr.a);
                long a3 = dzl.a(llpVar, dzo.RECENTS);
                long a4 = dzl.a(llpVar, dzo.CONTEXTUAL);
                long a5 = dzl.a(llpVar, dzo.CURATED);
                idk idkVar = dzlVar2.d;
                csw cswVar = csw.RICH_CONTENT_SUGGESTION_IMPRESSION;
                Object[] objArr = new Object[5];
                EditorInfo editorInfo = dzlVar2.n;
                objArr[0] = editorInfo != null ? ham.m(editorInfo) : null;
                dzq dzqVar = (dzq) dzlVar2.h.z(dzq.class, 0);
                if (dzqVar.b() != 1) {
                    mdjVar = mdj.QUERY;
                } else {
                    dzo dzoVar = dzqVar.d().b;
                    if (dzoVar == dzo.RECENTS || dzoVar == dzo.CONTEXTUAL || dzoVar == dzo.CURATED) {
                        mdjVar = mdj.ZERO_STATE;
                    } else {
                        mdjVar = mdj.QUERY;
                    }
                }
                objArr[1] = mdjVar;
                objArr[2] = Long.valueOf(a3);
                objArr[3] = Long.valueOf(a4);
                objArr[4] = Long.valueOf(a5);
                idkVar.e(cswVar, objArr);
                return;
            }
        }
        ((ltd) ((ltd) o.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionUiController", "changeUiState", 313, "ContentSuggestionUiController.java")).t("Attempted to change UI state on inactive keyboard");
    }

    public final void b() {
        this.A.close();
    }

    public final void c() {
        i(this.w, 0);
    }

    public final void d() {
        if (this.z) {
            dzx dzxVar = this.n;
            dzxVar.d.b();
            dzxVar.i = dat.a;
            dzxVar.e();
            dzl dzlVar = this.A;
            dzlVar.n = null;
            dzlVar.b();
            ijl.b().d(this.p, dzu.class);
            ijl.b().d(this.r, cun.class);
            BindingRecyclerView bindingRecyclerView = this.f;
            if (bindingRecyclerView != null) {
                bindingRecyclerView.aa(null);
            }
            this.m = dat.a;
            this.a.set(mdi.UNKNOWN);
            if (this.k != null) {
                hjq.a(this.b).l(this.k);
            }
            if (this.l != null) {
                hjq.a(this.b).l(this.l);
            }
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(null);
            }
        }
        this.z = false;
        this.d = null;
        this.e = null;
    }

    public final void e(SoftKeyboardView softKeyboardView, icf icfVar, EmojiPickerLayoutManager emojiPickerLayoutManager, BooleanSupplier booleanSupplier) {
        if (icfVar.b == ice.BODY) {
            this.y = booleanSupplier;
            dzx dzxVar = this.n;
            dzxVar.b.X(dzxVar, R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
            dzxVar.e = iqe.e(dzn.b, 2);
            dzxVar.f = iqh.e(dzxVar.d());
            hhq.p(dzxVar, dzn.n);
            BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f52610_resource_name_obfuscated_res_0x7f0b00b3);
            this.f = bindingRecyclerView;
            if (bindingRecyclerView == null) {
                ((ltd) ((ltd) o.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionUiController", "onKeyboardViewCreated", 140, "ContentSuggestionUiController.java")).t("Emoji kitchen binding recycler view doesn't exist.");
                return;
            }
            if (emojiPickerLayoutManager != null) {
                bindingRecyclerView.ab(emojiPickerLayoutManager);
            } else {
                bindingRecyclerView.ab(new LinearLayoutManager(0));
            }
            this.f.aa(this.t);
            this.u = softKeyboardView.findViewById(R.id.f53590_resource_name_obfuscated_res_0x7f0b012e);
            ((ImageView) softKeyboardView.findViewById(R.id.f66840_resource_name_obfuscated_res_0x7f0b081c)).setImageResource(R.drawable.f50610_resource_name_obfuscated_res_0x7f080366);
            View findViewById = softKeyboardView.findViewById(R.id.f66850_resource_name_obfuscated_res_0x7f0b081d);
            this.g = findViewById;
            if (findViewById != null) {
                findViewById.setContentDescription(this.b.getResources().getString(R.string.f159350_resource_name_obfuscated_res_0x7f1405d0));
                this.g.setOnClickListener(new dbg(new dwx(this, 11), 0));
            }
            this.v = (ViewGroup) softKeyboardView.findViewById(R.id.f53580_resource_name_obfuscated_res_0x7f0b012d);
            this.w = softKeyboardView.findViewById(R.id.f67720_resource_name_obfuscated_res_0x7f0b0888);
            this.h = (AppCompatTextView) softKeyboardView.findViewById(R.id.f67750_resource_name_obfuscated_res_0x7f0b088b);
            this.i = (AppCompatTextView) softKeyboardView.findViewById(R.id.f67760_resource_name_obfuscated_res_0x7f0b088c);
            this.j = (ImageView) softKeyboardView.findViewById(R.id.f67740_resource_name_obfuscated_res_0x7f0b088a);
            this.x = (ImageView) softKeyboardView.findViewById(R.id.f67710_resource_name_obfuscated_res_0x7f0b0887);
            i(this.w, 0);
            i(this.f, 4);
            l(this.i, new dbg(new dwx(this, 12), 0));
            h(this.i, this.b.getString(R.string.f162970_resource_name_obfuscated_res_0x7f140755));
            ImageView imageView = this.x;
            if (imageView != null) {
                imageView.setZ(-100.0f);
                this.l = new bfc(this.x);
            }
            ImageView imageView2 = this.j;
            if (imageView2 == null) {
                return;
            }
            this.k = new bfc(imageView2);
        }
    }

    public final void f(icf icfVar) {
        if (icfVar.b == ice.BODY) {
            dzx dzxVar = this.n;
            dzxVar.b.ad(dzxVar);
            dzxVar.e.close();
            dzxVar.f.close();
            hhq.q(dzxVar);
            l(this.g, null);
            this.g = null;
            l(this.i, null);
            this.i = null;
            this.u = null;
            this.f = null;
            this.h = null;
            this.v = null;
            this.w = null;
            this.j = null;
            this.x = null;
            this.k = null;
            this.l = null;
            this.y = null;
        }
    }

    public final void g(dat datVar) {
        this.m = datVar;
        this.A.l = datVar;
    }

    public final void j(eab eabVar) {
        if (dau.c(this.f)) {
            this.f.Y(0);
        }
        LifecycleKeyboard lifecycleKeyboard = this.e;
        if (lifecycleKeyboard != null) {
            dzl dzlVar = this.A;
            dzlVar.b();
            llp llpVar = eabVar.b;
            if (llpVar.isEmpty()) {
                String str = dzlVar.l.b;
            } else {
                dzlVar.h.M(lre.ab(llpVar.subList(0, Math.min(llpVar.size(), dzlVar.e)), dar.o));
                lfb lfbVar = eabVar.c;
                if (lfbVar.e()) {
                    hiz hizVar = (hiz) lfbVar.a();
                    dzlVar.h.I(llp.s(dzg.a(ead.a(dzlVar.c)), dzc.a));
                    lfb y = hizVar.y();
                    if (y.e() && !((dzp) y.a()).a.k().isEmpty()) {
                        dzlVar.c((dzp) y.a());
                    } else {
                        dzlVar.k.c();
                        afp afpVar = afp.STARTED;
                        boolean z = jam.b;
                        llk e = llp.e();
                        llk e2 = llp.e();
                        llk e3 = llp.e();
                        e.h(new dys(dzlVar, 4));
                        e2.h(new dys(dzlVar, 5));
                        dzlVar.i = hjg.a(gyc.b, lifecycleKeyboard, afpVar, z, e, e2, e3);
                        hizVar.E(dzlVar.i);
                    }
                }
            }
        }
        a(mdi.INTERSTITIAL);
    }

    public final void k(LifecycleKeyboard lifecycleKeyboard, EditorInfo editorInfo, boolean z) {
        View view;
        this.d = editorInfo;
        this.e = lifecycleKeyboard;
        if ((this.n.f(editorInfo) && (z || !jam.r(this.b))) || (view = this.u) == null) {
            this.z = false;
            this.n.d.a();
            dzl dzlVar = this.A;
            dzlVar.m = lifecycleKeyboard;
            dzlVar.n = editorInfo;
            if (dau.c(this.f)) {
                this.f.aa(this.t);
            }
            a(mdi.ZERO);
            ViewGroup viewGroup = this.v;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(new LayoutTransition());
            }
            ijl.b().h(this.r, cun.class, gyc.b);
            ijl.b().h(this.p, dzu.class, gyc.b);
            return;
        }
        view.setVisibility(8);
        this.z = true;
    }
}
