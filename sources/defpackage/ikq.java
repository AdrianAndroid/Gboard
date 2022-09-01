package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.avatar.creation.CreateAvatarActivity;
import com.google.android.libraries.avatar.customizer.CustomizeAvatarActivity;
import com.google.android.libraries.stickers.megamode.MegamodeActivity;
import com.google.android.libraries.stickers.megamode.MegamodeView;

/* compiled from: PG */
/* renamed from: ikq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ikq implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ikq(MegamodeView megamodeView, njs njsVar, int i) {
        this.c = i;
        this.b = megamodeView;
        this.a = njsVar;
    }

    public /* synthetic */ ikq(ikt iktVar, ika ikaVar, int i) {
        this.c = i;
        this.a = iktVar;
        this.b = ikaVar;
    }

    public /* synthetic */ ikq(iqs iqsVar, Context context, int i) {
        this.c = i;
        this.a = iqsVar;
        this.b = context;
    }

    public /* synthetic */ ikq(knx knxVar, njs njsVar, int i) {
        this.c = i;
        this.b = knxVar;
        this.a = njsVar;
    }

    public /* synthetic */ ikq(kob kobVar, njr njrVar, int i) {
        this.c = i;
        this.b = kobVar;
        this.a = njrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = null;
        switch (this.c) {
            case 0:
                ((ilb) ((ikt) this.a).d).a(new ikw(), (ika) this.b);
                return;
            case 1:
                ((ilb) ((ikt) this.a).d).a(new iky(), (ika) this.b);
                return;
            case 2:
                Object obj = this.a;
                hxk.a((Context) this.b).b(view, 0);
                ((ltd) ((ltd) iqs.a.b()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "lambda$showAddToDictionaryNotice$2", 301, "SpellCheckerExtension.java")).t("click undo the add to dictionary");
                iqs iqsVar = (iqs) obj;
                iqsVar.d().z(hfd.d(new iay(-400003, null, null)));
                iqsVar.c.e(iqu.SC_ADD_TO_DICT_UNDO, meb.SPELL_CORRECTION);
                ker.r();
                iqsVar.d().G();
                return;
            case 3:
                Object obj2 = this.a;
                Context context = (Context) this.b;
                hxk.a(context).b(view, 0);
                iqs iqsVar2 = (iqs) obj2;
                iqsVar2.d().z(hfd.d(new iay(-400002, null, null)));
                iqsVar2.c.e(iqu.SC_ADD_TO_DICT, meb.SPELL_CORRECTION);
                hsk hskVar = iqsVar2.b.a;
                View G = hskVar == null ? null : hskVar.G();
                if (G != null) {
                    view2 = G.findViewById(R.id.keyboard_header_view_holder);
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    if (viewGroup.getChildCount() > 0) {
                        view2 = viewGroup.getChildAt(0);
                    }
                }
                if (view2 != null) {
                    boolean l = iqsVar2.d().h().l();
                    ikq ikqVar = new ikq(iqsVar2, context, 2);
                    hky a = hlf.a();
                    a.p("spell_check_add_to_dictionary");
                    a.m = 1;
                    a.s(R.layout.f133510_resource_name_obfuscated_res_0x7f0e0028);
                    a.o(true);
                    a.d = bwe.h;
                    a.m(true != l ? 2000L : 15000L);
                    a.c = view2;
                    a.k(true);
                    a.t(true);
                    a.g(context.getString(R.string.f166290_resource_name_obfuscated_res_0x7f1408cb));
                    a.a = new cfs(ikqVar, 6);
                    hkq.b(a.a());
                }
                ((ltd) ((ltd) iqs.a.b()).k("com/google/android/libraries/inputmethod/spellchecker/SpellCheckerExtension", "lambda$createAddToDictionaryChip$1", 274, "SpellCheckerExtension.java")).t("click add to dictionary");
                iqsVar2.f();
                iqsVar2.d().G();
                return;
            case 4:
                Object obj3 = this.b;
                Object obj4 = this.a;
                knx knxVar = (knx) obj3;
                kod kodVar = knxVar.s.f;
                MegamodeActivity megamodeActivity = (MegamodeActivity) kodVar;
                megamodeActivity.startActivityForResult(new Intent((Context) kodVar, CreateAvatarActivity.class).putIntegerArrayListExtra("styleIds", lre.D(Integer.valueOf(((njs) obj4).a))).putExtra("showPreview", false).putExtra("createNeverCreated", false).putExtra("theme_mode", megamodeActivity.l), 2);
                kns knsVar = ((knn) knxVar.s.e).e;
                nfh t = mlr.e.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((mlr) t.b).a = kcu.u(26);
                ((mlr) t.b).d = kcu.v(15);
                knsVar.a((mlr) t.cz());
                return;
            case 5:
                Object obj5 = this.b;
                Object obj6 = this.a;
                koc kocVar = ((kob) obj5).t;
                kod kodVar2 = kocVar.e;
                if (kodVar2 == null) {
                    return;
                }
                kodVar2.l(kocVar.d, (njr) obj6, false);
                return;
            case 6:
                Object obj7 = this.b;
                Object obj8 = this.a;
                kod kodVar3 = ((MegamodeView) obj7).k;
                if (kodVar3 == null) {
                    return;
                }
                ktu ktuVar = new ktu((Context) kodVar3, 0);
                ktuVar.r(R.string.f158120_resource_name_obfuscated_res_0x7f140508);
                njs njsVar = (njs) obj8;
                ktuVar.o(((MegamodeActivity) kodVar3).getString(R.string.f158110_resource_name_obfuscated_res_0x7f140507, new Object[]{njsVar.c}));
                ktuVar.q(R.string.f158100_resource_name_obfuscated_res_0x7f140506, new ees(njsVar, 16));
                ktuVar.p(R.string.f158090_resource_name_obfuscated_res_0x7f140505, gua.d);
                ktuVar.b().show();
                return;
            case 7:
                Object obj9 = this.b;
                Object obj10 = this.a;
                MegamodeView megamodeView = (MegamodeView) obj9;
                kod kodVar4 = megamodeView.k;
                if (kodVar4 == null) {
                    return;
                }
                njs njsVar2 = (njs) obj10;
                MegamodeActivity megamodeActivity2 = (MegamodeActivity) kodVar4;
                megamodeActivity2.startActivityForResult(new Intent((Context) kodVar4, CustomizeAvatarActivity.class).putExtra("styleId", njsVar2.a).putExtra("theme_mode", megamodeActivity2.l), 1);
                kns knsVar2 = ((knn) megamodeView.d).e;
                String k = kfl.k(njsVar2.a);
                nfh t2 = mlr.e.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ((mlr) t2.b).a = kcu.u(31);
                mlr mlrVar = (mlr) t2.b;
                mlrVar.c = k;
                mlrVar.d = kcu.v(15);
                knsVar2.a((mlr) t2.cz());
                return;
            default:
                Object obj11 = this.b;
                Object obj12 = this.a;
                kod kodVar5 = ((MegamodeView) obj11).k;
                if (kodVar5 == null) {
                    return;
                }
                njs njsVar3 = (njs) obj12;
                njr njrVar = njsVar3.e;
                if (njrVar == null) {
                    njrVar = njr.d;
                }
                kodVar5.l(njsVar3, njrVar, true);
                return;
        }
    }
}
