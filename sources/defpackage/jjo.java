package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jjo  reason: default package */
/* loaded from: classes.dex */
public final class jjo implements jjk {
    public final kaw a;
    private final Context b;
    private final kcq c;

    public jjo(Context context, kaw kawVar, kcq kcqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = context;
        this.a = kawVar;
        this.c = kcqVar;
    }

    @Override // defpackage.jjk
    public final mko b(jjj jjjVar) {
        char c;
        File h;
        String lastPathSegment = jjjVar.a.getLastPathSegment();
        jdg.u(lastPathSegment);
        try {
            Context context = this.b;
            Uri uri = jjjVar.a;
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode != -861391249) {
                if (hashCode == 3143036 && scheme.equals("file")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (scheme.equals("android")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                h = kqn.h(uri, context);
            } else if (c == 1) {
                h = kqn.e(uri);
            } else {
                throw new koy("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(uri))));
            }
            File parentFile = h.getParentFile();
            jdg.u(parentFile);
            try {
                return iq.b(new jjn(this, jjjVar, parentFile, lastPathSegment, (kaz) this.c.q(jjjVar.a, new kpl(1)), 0));
            } catch (IOException e) {
                jmk.e(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", jjjVar.a);
                nzv a = jhv.a();
                a.a = jhu.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                a.c = e;
                return kcu.J(a.e());
            }
        } catch (IOException e2) {
            jmk.c("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", jjjVar.a);
            nzv a2 = jhv.a();
            a2.a = jhu.MALFORMED_FILE_URI_ERROR;
            a2.c = e2;
            return kcu.J(a2.e());
        }
    }
}
