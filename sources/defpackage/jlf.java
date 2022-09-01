package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* renamed from: jlf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jlf implements miy {
    private final /* synthetic */ int g;
    public static final /* synthetic */ jlf f = new jlf(5);
    public static final /* synthetic */ jlf e = new jlf(4);
    public static final /* synthetic */ jlf d = new jlf(3);
    public static final /* synthetic */ jlf c = new jlf(2);
    public static final /* synthetic */ jlf b = new jlf(1);
    public static final /* synthetic */ jlf a = new jlf(0);

    private /* synthetic */ jlf(int i) {
        this.g = i;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.g;
        if (i == 0) {
            jig jigVar = (jig) obj;
            if (jigVar == null) {
                jigVar = jig.v;
            }
            return kcu.K(jigVar);
        } else if (i == 1) {
            jip b2 = jip.b(((jiu) obj).c);
            if (b2 == null) {
                b2 = jip.NONE;
            }
            return kcu.K(b2);
        } else if (i == 2) {
            jlj jljVar = new jlj();
            if (!((Boolean) obj).booleanValue()) {
                throw new IOException("failed to save sharedFilesMetadata", jljVar);
            }
            throw jljVar;
        } else if (i == 3) {
            List list = (List) obj;
            return kcu.K(true);
        } else if (i == 4) {
            fnx fnxVar = (fnx) obj;
            throw new kka(fnxVar.a(), fnxVar.getMessage(), fnxVar);
        } else {
            Uri uri = (Uri) obj;
            return kcu.K("");
        }
    }
}
