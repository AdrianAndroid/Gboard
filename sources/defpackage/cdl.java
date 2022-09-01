package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.inputmethod.libs.search.keyboard.SearchKeyboard;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: cdl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cdl implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ cdl(cdm cdmVar, hqt hqtVar, int i) {
        this.c = i;
        this.a = cdmVar;
        this.b = hqtVar;
    }

    public /* synthetic */ cdl(cdm cdmVar, jav javVar, int i) {
        this.c = i;
        this.a = cdmVar;
        this.b = javVar;
    }

    public /* synthetic */ cdl(eet eetVar, hln hlnVar, int i) {
        this.c = i;
        this.a = eetVar;
        this.b = hlnVar;
    }

    public /* synthetic */ cdl(fav favVar, Context context, int i) {
        this.c = i;
        this.b = favVar;
        this.a = context;
    }

    public /* synthetic */ cdl(faw fawVar, Context context, int i) {
        this.c = i;
        this.b = fawVar;
        this.a = context;
    }

    public /* synthetic */ cdl(hxt hxtVar, hxu hxuVar, int i) {
        this.c = i;
        this.a = hxtVar;
        this.b = hxuVar;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, hqt] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            cdm cdmVar = (cdm) obj;
            cdmVar.e.set(true);
            cdmVar.a.e(cap.LANG_ID_DIALOG_REJECTED, obj2);
        } else if (i2 == 1) {
            Object obj3 = this.a;
            ?? r12 = this.b;
            cdm cdmVar2 = (cdm) obj3;
            cdmVar2.e.set(true);
            cdmVar2.b.i(Collections.singletonList(r12));
            iin.p(cdmVar2.c, r12, 3);
            iay iayVar = new iay(-10065, null, Collections.emptyList());
            hls hlsVar = cdmVar2.d;
            hfd d = hfd.d(iayVar);
            d.g = 0;
            hlsVar.O(d);
            cdmVar2.a.e(cap.LANG_ID_DIALOG_AFFIRMATIVE, r12.i());
        } else if (i2 == 2) {
            Object obj4 = this.a;
            Object obj5 = this.b;
            cdm cdmVar3 = (cdm) obj4;
            cdmVar3.e.set(true);
            cdmVar3.a.e(cap.LANG_ID_DIALOG_OPENED_LANGUAGE_SETTINGS, obj5);
            cdmVar3.b.j(cdmVar3.c, 3, null);
        } else if (i2 == 3) {
            Object obj6 = this.a;
            Object obj7 = this.b;
            SearchKeyboard searchKeyboard = ((eet) obj6).b;
            searchKeyboard.b.e(ctd.RECENT_SEARCH_CANDIDATE_DELETE_CONFIRMED, Integer.valueOf(searchKeyboard.l()));
            ijl b = ijl.b();
            CharSequence charSequence = ((hln) obj7).a;
            if (charSequence == null) {
                ((ltd) eko.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/utils/RecentSearchDeletionNotification", "notify", 23, "RecentSearchDeletionNotification.java")).t("Cannot request deletion of candidate without text.");
            } else {
                b.g(new eko(charSequence.toString()));
            }
        } else if (i2 == 4) {
            Object obj8 = this.b;
            Object obj9 = this.a;
            fav favVar = (fav) obj8;
            fax.h(favVar.a);
            favVar.b.c(fbm.VOICE_DONATION_CONSENT_DIALOG_SHOWN);
            guc.a.a((Context) obj9, "ConsentDialog");
        } else if (i2 != 5) {
            gyc.b.execute(new hpq((hxt) this.a, dialogInterface, i, (hxu) this.b, 2));
        } else {
            Object obj10 = this.b;
            Object obj11 = this.a;
            faw fawVar = (faw) obj10;
            fax.h(fawVar.a);
            fawVar.b.c(fbm.VOICE_DONATION_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED);
            fawVar.b.a(fae.a((Context) obj11, true));
        }
    }
}
