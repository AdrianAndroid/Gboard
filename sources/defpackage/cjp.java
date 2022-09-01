package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import com.google.android.apps.inputmethod.libs.expression.candidatesupplier.ImageCandidatePopupView;
import com.google.android.apps.inputmethod.libs.expression.candidatesupplier.MultipleImageCandidatePopupView;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.Collection;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cjp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cjp implements hle {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cjp(Context context, View view, View view2, int i) {
        this.d = i;
        this.c = context;
        this.b = view;
        this.a = view2;
    }

    public /* synthetic */ cjp(cjt cjtVar, cjo cjoVar, EditorInfo editorInfo, int i) {
        this.d = i;
        this.a = cjtVar;
        this.b = cjoVar;
        this.c = editorInfo;
    }

    public /* synthetic */ cjp(fbf fbfVar, Context context, hsk hskVar, int i) {
        this.d = i;
        this.b = fbfVar;
        this.c = context;
        this.a = hskVar;
    }

    public /* synthetic */ cjp(String str, String str2, View.OnClickListener onClickListener, int i) {
        this.d = i;
        this.b = str;
        this.a = str2;
        this.c = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [hsk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [hsk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.hle
    public final void a(View view) {
        hqt b;
        int i = this.d;
        int i2 = 8;
        if (i == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            Object obj3 = this.c;
            cjt cjtVar = (cjt) obj;
            cin cinVar = cjtVar.j;
            if (cinVar != null) {
                cinVar.a();
            }
            lfb g = dau.g(ImageCandidatePopupView.class, view, view);
            if (!g.e()) {
                return;
            }
            cjtVar.j = (cin) g.a();
            final ImageCandidatePopupView imageCandidatePopupView = (ImageCandidatePopupView) g.a();
            cjo cjoVar = (cjo) obj2;
            Object g2 = cjoVar.g();
            int b2 = msc.b(cjoVar.b().c);
            if (b2 == 0) {
                b2 = 1;
            }
            final cjw cjwVar = new cjw(cjtVar.a((EditorInfo) obj3, cjoVar), new cjr(cjtVar, 2), new cjr(cjtVar, 1), new bsx(cjtVar, cjoVar, 6), new bsx(cjtVar, cjoVar, 7), new cjr(cjtVar, 0));
            hjq.a(imageCandidatePopupView.getContext()).i(g2).s(imageCandidatePopupView.e);
            imageCandidatePopupView.d.setOnClickListener(cjwVar.a);
            imageCandidatePopupView.g.setOnClickListener(cjwVar.a);
            imageCandidatePopupView.h.setOnClickListener(new View.OnClickListener() { // from class: cjv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final ImageCandidatePopupView imageCandidatePopupView2 = ImageCandidatePopupView.this;
                    cjw cjwVar2 = cjwVar;
                    if (imageCandidatePopupView2.i.getVisibility() != 0) {
                        imageCandidatePopupView2.clearAnimation();
                        imageCandidatePopupView2.n = ValueAnimator.ofInt(0, imageCandidatePopupView2.getResources().getDimensionPixelSize(R.dimen.f36550_resource_name_obfuscated_res_0x7f0702df));
                        imageCandidatePopupView2.n.setInterpolator(new afj());
                        imageCandidatePopupView2.n.setDuration(200L);
                        imageCandidatePopupView2.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cju
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ImageCandidatePopupView.this.setPadding(0, ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0, 0);
                            }
                        });
                        imageCandidatePopupView2.n.start();
                    }
                    imageCandidatePopupView2.c.setDisplayedChild(1);
                    cjwVar2.b.onClick(view2);
                    imageCandidatePopupView2.c.announceForAccessibility(imageCandidatePopupView2.getContext().getString(R.string.f154150_resource_name_obfuscated_res_0x7f140344));
                }
            });
            if (b2 != 23) {
                imageCandidatePopupView.p.c(imageCandidatePopupView.f);
                imageCandidatePopupView.m.setVisibility(8);
                imageCandidatePopupView.l.setVisibility(8);
            } else {
                imageCandidatePopupView.l.setVisibility(0);
                imageCandidatePopupView.m.setVisibility(0);
                imageCandidatePopupView.o.c(imageCandidatePopupView.f);
                imageCandidatePopupView.l.setOnClickListener(cjwVar.c);
            }
            imageCandidatePopupView.i.setOnClickListener(cjwVar.d);
            imageCandidatePopupView.j.setOnClickListener(cjwVar.e);
            imageCandidatePopupView.k.setOnClickListener(cjwVar.f);
            View view2 = imageCandidatePopupView.i;
            if (true == ((Boolean) cit.s.c()).booleanValue()) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            cjtVar.g.e(ciu.IMAGE_CANDIDATE_USAGE, 4);
        } else if (i == 1) {
            Object obj4 = this.c;
            Object obj5 = this.b;
            View view3 = (View) this.a;
            view3.setVisibility(4);
            Context context = (Context) obj4;
            ((LinkableTextView) view.findViewById(R.id.f53390_resource_name_obfuscated_res_0x7f0b0118)).a = new bwd(context, 0);
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            View findViewById = view.findViewById(R.id.f53380_resource_name_obfuscated_res_0x7f0b0117);
            View view4 = (View) obj5;
            findViewById.measure(View.MeasureSpec.makeMeasureSpec((view4.getWidth() - view4.getPaddingLeft()) - view4.getPaddingRight(), Integer.MIN_VALUE), 0);
            layoutParams.height = findViewById.getMeasuredHeight() + context.getResources().getDimensionPixelOffset(R.dimen.f32960_resource_name_obfuscated_res_0x7f0700f5);
            view3.setLayoutParams(layoutParams);
            view3.requestLayout();
            ((Button) view.findViewById(R.id.f53400_resource_name_obfuscated_res_0x7f0b0119)).setOnClickListener(new hk(view3, 13));
            ((Button) view.findViewById(R.id.f53410_resource_name_obfuscated_res_0x7f0b011a)).setOnClickListener(new bsx(view3, context, 4));
        } else if (i == 2) {
            Object obj6 = this.a;
            Object obj7 = this.b;
            Object obj8 = this.c;
            cjt cjtVar2 = (cjt) obj6;
            cjtVar2.e(0.2f);
            cin cinVar2 = cjtVar2.j;
            if (cinVar2 != null) {
                cinVar2.a();
            }
            lfb g3 = dau.g(MultipleImageCandidatePopupView.class, view, view);
            if (!g3.e()) {
                return;
            }
            cjtVar2.j = (cin) g3.a();
            MultipleImageCandidatePopupView multipleImageCandidatePopupView = (MultipleImageCandidatePopupView) g3.a();
            cjq cjqVar = new cjq(cjtVar2, (EditorInfo) obj8, 0);
            BindingRecyclerView bindingRecyclerView = multipleImageCandidatePopupView.d;
            cuj a = bindingRecyclerView.a();
            if (a == null) {
                Context context2 = multipleImageCandidatePopupView.c;
                lls h = llw.h();
                gmi i3 = cnx.i();
                i3.n(R.layout.f135000_resource_name_obfuscated_res_0x7f0e00da, new byi(cjqVar, 8));
                h.a(cjo.class, i3.m());
                a = cnx.f(h, context2, null, null);
                bindingRecyclerView.aa(a);
                bindingRecyclerView.ab(new LinearLayoutManager(0));
            }
            cjo cjoVar2 = (cjo) obj7;
            boolean e = cjoVar2.e().e();
            dau.i(e, "alternativeCandidates is absent, cannot load multiple image candidates popup");
            if (e) {
                a.J((Collection) cjoVar2.e().a());
            }
            cjtVar2.g.e(ciu.IMAGE_CANDIDATE_USAGE, 4);
        } else if (i == 3) {
            view.setOnClickListener(new buw((fbf) this.b, (Context) this.c, (hsk) this.a, 10));
        } else if (i == 4) {
            Object obj9 = this.b;
            Object obj10 = this.c;
            ?? r4 = this.a;
            Context context3 = (Context) obj10;
            fbf fbfVar = (fbf) obj9;
            view.findViewById(R.id.f130670_resource_name_obfuscated_res_0x7f0b21fe).setOnClickListener(new eiz(fbfVar, context3, 19));
            view.setOnClickListener(bwk.h);
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f130680_resource_name_obfuscated_res_0x7f0b21ff);
            kki.z(appCompatTextView);
            if (((Boolean) fbh.K.c()).booleanValue() && (b = hqp.b()) != null) {
                Locale q = b.q();
                String string = context3.getString(R.string.f187980_resource_name_obfuscated_res_0x7f141193, q.getDisplayLanguage(q));
                appCompatTextView.setText(string);
                appCompatTextView.setContentDescription(gqa.c(q, string));
            }
            view.findViewById(R.id.f130690_resource_name_obfuscated_res_0x7f0b2200).setOnClickListener(new buw(fbfVar, context3, (hsk) r4, 9));
        } else {
            ?? r2 = this.b;
            ?? r3 = this.a;
            ?? r5 = this.c;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.f129960_resource_name_obfuscated_res_0x7f0b21a9);
            appCompatTextView2.setText((CharSequence) r2);
            Button button = (Button) view.findViewById(R.id.f129950_resource_name_obfuscated_res_0x7f0b21a8);
            if (button == 0) {
                return;
            }
            if (r3 != 0) {
                button.setText((CharSequence) r3);
                button.setOnClickListener(r5);
                return;
            }
            button.setVisibility(8);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatTextView2.getLayoutParams();
            marginLayoutParams.setMarginEnd(jbt.e(appCompatTextView2.getContext(), R.attr.f7140_resource_name_obfuscated_res_0x7f0401ff));
            appCompatTextView2.setLayoutParams(marginLayoutParams);
        }
    }
}
