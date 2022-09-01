package defpackage;

import android.icu.util.ULocale;
import android.view.translation.TranslationContext;
import android.view.translation.TranslationSpec;
import com.google.android.apps.inputmethod.libs.translate.SystemTranslateProvider;
import j$.util.Objects;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: iis  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iis implements rl {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ iis(SystemTranslateProvider systemTranslateProvider, String str, String str2, int i) {
        this.d = i;
        this.b = systemTranslateProvider;
        this.a = str;
        this.c = str2;
    }

    public /* synthetic */ iis(iiu iiuVar, jpv jpvVar, oqi oqiVar, int i, byte[] bArr) {
        this.d = i;
        this.a = iiuVar;
        this.b = jpvVar;
        this.c = oqiVar;
    }

    public /* synthetic */ iis(its itsVar, iiy[] iiyVarArr, itv itvVar, int i) {
        this.d = i;
        this.b = itsVar;
        this.c = iiyVarArr;
        this.a = itvVar;
    }

    @Override // defpackage.rl
    public final Object a(rj rjVar) {
        int i = this.d;
        if (i == 0) {
            Object obj = this.a;
            Object obj2 = this.b;
            Object obj3 = this.c;
            iit iitVar = new iit(rjVar, (jpv) obj2, null);
            oqh g = oqh.g(((iiu) obj).b.a(), (oqi) obj3);
            Objects.requireNonNull(g);
            rjVar.a(new ihi(g, 5), mjl.a);
            g.c(iitVar);
            return iitVar;
        } else if (i == 1) {
            Object obj4 = this.b;
            Object obj5 = this.a;
            Object obj6 = this.c;
            SystemTranslateProvider systemTranslateProvider = (SystemTranslateProvider) obj4;
            if (systemTranslateProvider.e == null) {
                rjVar.c(null);
            } else {
                systemTranslateProvider.translatorCompleter = rjVar;
                TranslationContext build = new TranslationContext.Builder(new TranslationSpec(ULocale.forLanguageTag((String) obj5), 1), new TranslationSpec(ULocale.forLanguageTag((String) obj6), 1)).build();
                Objects.requireNonNull(rjVar);
                systemTranslateProvider.e.createOnDeviceTranslator(build, systemTranslateProvider.f, Consumer.Wrapper.convert(new chf(rjVar, 16)));
            }
            return null;
        } else {
            Object obj7 = this.b;
            Object obj8 = this.c;
            Object obj9 = this.a;
            if (!ijf.h((iiy[]) obj8)) {
                itv itvVar = (itv) obj9;
                String str = itvVar.a + lfq.a.nextInt();
                its itsVar = (its) obj7;
                ija b = ijf.b(new epv(itsVar, rjVar, str, 15), (iiy[]) itvVar.d.toArray(new iiy[0]));
                itsVar.d.put(str, b);
                b.e(itsVar.b);
                return "components-ready-future";
            }
            rjVar.c(null);
            return "components-ready-future";
        }
    }
}
