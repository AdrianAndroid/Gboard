package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: fgd  reason: default package */
/* loaded from: classes.dex */
public final class fgd implements gow {
    public static final lug a = lug.i("GboardS3RMutator");
    public static final String b = String.format("%s:%s", "oauth2", "https://www.googleapis.com/auth/assistant");
    public static final hhl c = hhq.f("voice_donation_interval_seconds", 86400);
    public static final hhl d = hhq.f("voice_donation_max_donations", 5);
    public static final Pattern e = Pattern.compile("^(\\d+\\.\\d+).*$");
    public final Context f;
    public final ffd g;

    public fgd(Context context, ffd ffdVar) {
        this.f = context;
        this.g = ffdVar;
    }

    public static nkp a(jav javVar) {
        nfh t = nkp.d.t();
        String str = javVar.n;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkp nkpVar = (nkp) t.b;
        str.getClass();
        int i = nkpVar.a | 1;
        nkpVar.a = i;
        nkpVar.b = str;
        nkpVar.a = i | 2;
        nkpVar.c = 1;
        return (nkp) t.cz();
    }
}
