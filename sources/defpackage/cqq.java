package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: cqq  reason: default package */
/* loaded from: classes.dex */
public final class cqq {
    public static final hhl a = hhq.a("enable_bitmoji_sharing_api_from_gboard", false);
    public static final hhl b = hhq.a("enable_bitmoji_sharing_api_from_bitmoji", false);
    public static final hhl c = hhq.f("min_bitmoji_version_for_whatsapp_webp_directly", -1);
    public static final hhl d = hhq.f("bitmoji_share_api_timeout_ms", -1);
    public final Context e;
    public final mkr f;
    public final ScheduledExecutorService g;
    public final crr h;
    public final idk i;
    public final jls j;

    public cqq(Context context, idk idkVar) {
        mks a2 = gxo.a(6);
        mks c2 = gxo.c(6);
        jls jlsVar = new jls(context, null, null);
        Context applicationContext = context.getApplicationContext();
        crr crrVar = new crr(applicationContext, new crp(applicationContext, idkVar));
        this.e = context;
        this.f = a2;
        this.g = c2;
        this.i = idkVar;
        this.j = jlsVar;
        this.h = crrVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.ContentProviderClient, java.lang.String] */
    public final Uri a(Uri uri, String str, cre creVar) {
        int i;
        idn a2 = this.i.a(crh.BITMOJI_SHARE_INSERT);
        ContentValues contentValues = new ContentValues();
        ContentProviderClient contentProviderClient = "share_to";
        contentValues.put((String) contentProviderClient, str);
        contentValues.put("image_format", creVar.d);
        contentValues.put("with_white_background", "false");
        try {
            try {
                try {
                    try {
                        Uri insert = this.j.j(uri).insert(uri, contentValues);
                        if (insert != null) {
                            return insert;
                        }
                        this.i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, 5);
                        throw new IllegalStateException("Bitmoji content provider share uri is null");
                    } catch (RemoteException | RuntimeException e) {
                        String obj = uri.toString();
                        throw new irb("Insert failed for " + obj, e);
                    }
                } catch (RuntimeException e2) {
                    if (!(e2 instanceof ird)) {
                        i = e2 instanceof irg ? 7 : 8;
                    } else {
                        i = 6;
                    }
                    this.i.e(cqw.BITMOJI_SHARE_API_RESPONSE_DETAILED_FAILURE, Integer.valueOf(i));
                    throw e2;
                }
            } finally {
                jls.l(contentProviderClient);
            }
        } finally {
            a2.a();
        }
    }

    public final boolean b() {
        long longValue = ((Long) c.c()).longValue();
        return longValue >= 0 && ((long) jam.f(this.e, "com.bitstrips.imoji")) >= longValue;
    }
}
