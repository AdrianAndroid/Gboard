package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.voiceime.VoiceCircleView;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: fbk  reason: default package */
/* loaded from: classes.dex */
public final class fbk implements fey {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeHeader");
    public final View b;
    public final View c;
    public final View d;
    public final gqh e;
    public final View f;
    public final VoiceCircleView g;
    public final View h;
    public final View i;
    public final Animator j;
    public final imn k;
    public final fbl l;
    public final jcd m = new fbi(this);
    public final opu n;
    private final AppCompatTextView o;
    private final hwu p;

    public fbk(Context context, opu opuVar, imn imnVar, View view, View view2, byte[] bArr, byte[] bArr2) {
        ViewGroup viewGroup;
        fbj fbjVar = new fbj(this);
        this.p = fbjVar;
        this.n = opuVar;
        this.k = imnVar;
        this.b = view;
        this.c = view2;
        this.f = view.findViewById(R.id.f56140_resource_name_obfuscated_res_0x7f0b025a);
        View b = imnVar.b(context, R.layout.f147070_resource_name_obfuscated_res_0x7f0e0610);
        this.i = b;
        VoiceCircleView voiceCircleView = (VoiceCircleView) b.findViewById(R.id.f130860_resource_name_obfuscated_res_0x7f0b2216);
        this.g = voiceCircleView;
        voiceCircleView.setOnClickListener(new fat(opuVar, 5, null, null));
        ObjectAnimator duration = ObjectAnimator.ofFloat(voiceCircleView, VoiceCircleView.a, voiceCircleView.b, voiceCircleView.c).setDuration(415L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(voiceCircleView, VoiceCircleView.a, voiceCircleView.b).setDuration(415L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration2).after(duration);
        animatorSet.addListener(new fap(voiceCircleView));
        this.j = animatorSet;
        this.h = view2.findViewById(R.id.f130870_resource_name_obfuscated_res_0x7f0b2217);
        if (((Boolean) iho.b.c()).booleanValue()) {
            this.o = (AppCompatTextView) view2.findViewById(R.id.f130890_resource_name_obfuscated_res_0x7f0b2219);
            viewGroup = (ViewGroup) view2.findViewById(R.id.f130710_resource_name_obfuscated_res_0x7f0b2202);
            String c = gqn.c(context.getString(R.string.f154020_resource_name_obfuscated_res_0x7f140337));
            Objects.requireNonNull(opuVar);
            fal falVar = new fal(opuVar, 6, null, null);
            gqe a2 = gqn.a(c, true);
            a2.l(falVar);
            this.e = a2.a();
            this.d = null;
        } else {
            this.o = (AppCompatTextView) view2.findViewById(R.id.f130880_resource_name_obfuscated_res_0x7f0b2218);
            viewGroup = (ViewGroup) view2.findViewById(R.id.f130720_resource_name_obfuscated_res_0x7f0b2203);
            this.d = view.findViewById(R.id.key_pos_header_access_points_menu);
            this.e = null;
        }
        this.o.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
        this.l = new fbl(context, viewGroup);
        hsx.c().a(ice.HEADER, fbjVar);
    }

    public final void a() {
        this.o.setText("");
    }

    @Override // defpackage.fey
    public final void b() {
        if (this.j.isRunning()) {
            this.j.end();
        }
        this.k.c(this.i, null, true);
        if (this.c != null) {
            hsx.c().e(ice.HEADER, R.id.f130700_resource_name_obfuscated_res_0x7f0b2201, true, true);
            View view = this.d;
            if (view != null) {
                view.setVisibility(0);
            } else {
                gqh gqhVar = this.e;
                if (gqhVar != null) {
                    grd.b(R.id.key_pos_header_access_points_menu, gqhVar.a);
                }
            }
            View view2 = this.f;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        fbl fblVar = this.l;
        fblVar.b.c();
        fblVar.a.removeAllViews();
        fblVar.a.setVisibility(8);
        ijl.b().d(this.m, jce.class);
        this.h.setOnClickListener(null);
        this.h.setVisibility(8);
        hsx.c().l(ice.HEADER, this.p);
        ijf.k(jcj.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        this.o.setText(i);
    }
}
