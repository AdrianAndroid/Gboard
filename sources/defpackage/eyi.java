package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.autotranslate.AutoTranslatePreferenceFragment;
import java.util.Map;

/* compiled from: PG */
/* renamed from: eyi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eyi implements eyl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyi(AutoTranslatePreferenceFragment autoTranslatePreferenceFragment, Context context, int i) {
        this.c = i;
        this.b = autoTranslatePreferenceFragment;
        this.a = context;
    }

    public /* synthetic */ eyi(eyk eykVar, eyl eylVar, int i) {
        this.c = i;
        this.a = eykVar;
        this.b = eylVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eyl, java.lang.Object] */
    @Override // defpackage.eyl
    public final void a(Map map, Map map2) {
        Map map3;
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            ?? r1 = this.b;
            eyk eykVar = (eyk) obj;
            eykVar.a = map.keySet();
            eykVar.b = map2.keySet();
            Map map4 = eykVar.d;
            if (map4 == null || (map3 = eykVar.c) == null || r1 == 0) {
                return;
            }
            r1.a(map3, map4);
        } else if (i == 1) {
            gyc.b.execute(new bue((AutoTranslatePreferenceFragment) this.b, map, (Context) this.a, 1));
        } else {
            Object obj2 = this.a;
            ?? r12 = this.b;
            eyk eykVar2 = (eyk) obj2;
            eykVar2.c = map;
            eykVar2.d = map2;
            if (r12 == 0) {
                return;
            }
            r12.a(eykVar2.c, eykVar2.d);
        }
    }
}
