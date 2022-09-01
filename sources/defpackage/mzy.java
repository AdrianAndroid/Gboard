package defpackage;

import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: mzy  reason: default package */
/* loaded from: classes2.dex */
public final class mzy extends mzv {
    private final String a;
    private final Set c;

    public mzy(String str, Set set) {
        oll.e(set, "options");
        this.a = str;
        this.c = set;
    }

    @Override // defpackage.mzv
    public final List a() {
        return nxp.n(this.a);
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        String concat = "^".concat(this.a);
        Set<omq> set = this.c;
        oll.e(set, "options");
        int i = 0;
        for (omq omqVar : set) {
            i |= omqVar.a();
        }
        if ((i & 2) != 0) {
            i |= 64;
        }
        Pattern compile = Pattern.compile(concat, i);
        oll.d(compile, "compile(pattern, ensureU…odeCase(options.toInt()))");
        omu omuVar = new omu(compile);
        String substring = str.substring(mzzVar.b);
        oll.d(substring, "this as java.lang.String).substring(startIndex)");
        oll.e(substring, "input");
        Matcher matcher = omuVar.a.matcher(substring);
        oll.d(matcher, "nativePattern.matcher(input)");
        oms omsVar = !matcher.find(0) ? null : new oms(matcher, substring);
        if (omsVar != null) {
            return new mzu(omsVar.a().get(1), mzzVar, mzzVar.a((String) omsVar.a().get(0)));
        }
        String str2 = this.a;
        return ndb.v(this, "Expecting '" + str2 + "'", str, mzzVar);
    }
}
