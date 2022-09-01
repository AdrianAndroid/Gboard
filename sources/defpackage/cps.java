package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: cps  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cps implements hiv {
    private final /* synthetic */ int f;
    public static final /* synthetic */ cps e = new cps(4);
    public static final /* synthetic */ cps d = new cps(3);
    public static final /* synthetic */ cps c = new cps(2);
    public static final /* synthetic */ cps b = new cps(1);
    public static final /* synthetic */ cps a = new cps(0);

    public /* synthetic */ cps(int i) {
        this.f = i;
    }

    @Override // defpackage.hiv
    public final Object a(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                irh irhVar = (irh) obj;
                if (irhVar.moveToFirst()) {
                    return Integer.valueOf(irhVar.getInt(0));
                }
                return 0;
            } else if (i == 2) {
                return ((irh) obj).b(cli.k);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return ((irh) obj).b(cli.p);
                    }
                    iij iijVar = (iij) obj;
                    if (!iijVar.c || iijVar.d != null) {
                        throw new cwy(String.format(Locale.US, "List sticker packs failed with code: %d", Integer.valueOf(iijVar.b)), iijVar.d);
                    }
                    return iijVar.e.D();
                }
                irh irhVar2 = (irh) obj;
                cli cliVar = cli.n;
                cli cliVar2 = cli.o;
                lls i2 = llw.i(irhVar2.getCount());
                irhVar2.moveToPosition(-1);
                while (irhVar2.moveToNext()) {
                    i2.a(cliVar.a(irhVar2), cliVar2.a(irhVar2));
                }
                return i2.l();
            }
        }
        return ((irh) obj).b(cli.l);
    }
}
