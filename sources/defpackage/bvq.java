package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: bvq  reason: default package */
/* loaded from: classes.dex */
public final class bvq {
    public static String a() {
        return String.format(Locale.US, "create table if not exists %s (%s %s primary key NOT NULL, %s %s, %s %s, %s %s NOT NULL, %s %s NOT NULL, %s %s, %s %s, %s %s, UNIQUE(%s, %s, %s) ON CONFLICT REPLACE)", "clips", "_id", "integer", "text", "text", "html_text", "text", "item_type", "integer", "entity_type", "integer", "timestamp", "integer", "uri", "text", "group_id", "integer", "text", "html_text", "uri");
    }

    public static void c(dij dijVar, Map map) {
        if (dijVar.q() != null) {
            map.put(dijVar.g(), dijVar);
            dij ge = dijVar.ge();
            if (ge == null || TextUtils.isEmpty("en-t-i0-und")) {
                return;
            }
            map.put("en-t-i0-und", ge);
        }
    }

    public static int d(erm ermVar) {
        if (ermVar == null) {
            return 1;
        }
        switch (ermVar.ordinal()) {
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 18;
            case 4:
                return 19;
            case 5:
                return 27;
            case 6:
                return 28;
            case 7:
                return 29;
            case 8:
                return 4;
            case 9:
                return 5;
            case 10:
                return 6;
            case 11:
                return 7;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 8;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 9;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 10;
            case 15:
                return 11;
            case 16:
                return 22;
            case 17:
                return 12;
            case 18:
                return 13;
            case 19:
                return 14;
            case 20:
                return 15;
            case 21:
                return 16;
            case 22:
                return 17;
            case 23:
                return 20;
            case 24:
                return 21;
            default:
                return 1;
        }
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static mko f(mko mkoVar, long j, TimeUnit timeUnit, gnn gnnVar) {
        bnk bnkVar = new bnk(mkoVar);
        gnnVar.e(timeUnit.toMillis(j), new gky(bnkVar, 1));
        Objects.requireNonNull(bnkVar);
        mkoVar.d(new att(bnkVar, 9), mjl.a);
        return bnkVar;
    }

    public static Object g(Future future) {
        if (!future.isDone()) {
            bvq bvqVar = bnn.a;
        }
        return future.get();
    }

    public static Object h(Future future) {
        if (future.isDone()) {
            try {
                return kcu.z(future);
            } catch (CancellationException | ExecutionException unused) {
                return null;
            }
        }
        return null;
    }

    public static final blr i(int i, boolean z, boolean z2, int i2, int i3) {
        return new blr(i, z, z2, i2, i3);
    }

    public static int j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int limit = byteBuffer.limit();
        try {
            int min = Math.min(byteBuffer2.remaining(), byteBuffer.remaining());
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer2.put(byteBuffer);
            return min;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static int k(int i) {
        return i - 2;
    }

    public static int l(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 3) {
                return 4;
            }
            switch (i) {
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                case 10:
                    return 11;
                case 11:
                    return 12;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    return 13;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    return 14;
                default:
                    return 0;
            }
        }
        return 1;
    }

    public static bvq m() {
        return new bvq();
    }
}
