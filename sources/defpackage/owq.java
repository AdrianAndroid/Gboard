package defpackage;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataSink;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: owq  reason: default package */
/* loaded from: classes2.dex */
public final class owq implements oxb {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public owq(owq owqVar, int i, byte[] bArr) {
        this.b = i;
        this.a = owqVar;
    }

    public owq(owr owrVar, int i, byte[] bArr) {
        this.b = i;
        this.a = owrVar;
    }

    public owq(ows owsVar, int i) {
        this.b = i;
        this.a = owsVar;
    }

    public owq(owt owtVar, int i) {
        this.b = i;
        this.a = owtVar;
    }

    public owq(owy owyVar, int i) {
        this.b = i;
        this.a = owyVar;
    }

    public owq(oxa oxaVar, int i) {
        this.b = i;
        this.a = oxaVar;
    }

    @Override // defpackage.oxb
    public final void a() {
        List list;
        ReadableByteChannel readableByteChannel = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                Object obj = ((owq) this.a).a;
                ows owsVar = (ows) obj;
                owsVar.b.read((UploadDataSink) obj, owsVar.c);
                return;
            case 1:
                ows owsVar2 = ((owr) this.a).b;
                owsVar2.b.read(owsVar2, owsVar2.c);
                return;
            case 2:
                ows owsVar3 = (ows) this.a;
                if (owsVar3.g == null) {
                    owsVar3.i.l = 10;
                    owsVar3.f.setDoOutput(true);
                    owsVar3.f.connect();
                    owsVar3.i.l = 12;
                    owsVar3.h = owsVar3.f.getOutputStream();
                    owsVar3.g = Channels.newChannel(owsVar3.h);
                }
                ((ows) this.a).a.set(0);
                ((ows) this.a).a(new owq(this, 0, (byte[]) null));
                return;
            case 3:
                owt owtVar = (owt) this.a;
                ReadableByteChannel readableByteChannel2 = ((oxa) owtVar.b).n;
                int read = readableByteChannel2 == null ? -1 : readableByteChannel2.read((ByteBuffer) owtVar.a);
                owt owtVar2 = (owt) this.a;
                Object obj2 = owtVar2.b;
                Object obj3 = owtVar2.a;
                if (read != -1) {
                    oxa oxaVar = (oxa) obj2;
                    owy owyVar = oxaVar.b;
                    owyVar.a(new oww(owyVar, oxaVar.o, (ByteBuffer) obj3, 0));
                    return;
                }
                oxa oxaVar2 = (oxa) obj2;
                ReadableByteChannel readableByteChannel3 = oxaVar2.n;
                if (readableByteChannel3 != null) {
                    readableByteChannel3.close();
                }
                if (!oxaVar2.g.compareAndSet(5, 7)) {
                    return;
                }
                oxaVar2.h();
                owy owyVar2 = oxaVar2.b;
                owyVar2.b.execute(new owt(owyVar2, oxaVar2.o, 6));
                return;
            case 4:
                if (((oxa) this.a).q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String str = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = ((oxa) this.a).q.getHeaderFieldKey(i);
                    if (headerFieldKey != null) {
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = ((oxa) this.a).q.getHeaderField(i);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, ((oxa) this.a).q.getHeaderField(i)));
                        }
                        i++;
                    } else {
                        int responseCode = ((oxa) this.a).q.getResponseCode();
                        oxa oxaVar3 = (oxa) this.a;
                        oxaVar3.o = new oxh(new ArrayList(oxaVar3.f), responseCode, ((oxa) this.a).q.getResponseMessage(), Collections.unmodifiableList(arrayList), str);
                        if (responseCode < 300 || responseCode >= 400 || (list = (List) ((oxa) this.a).o.getAllHeaders().get("location")) == null) {
                            ((oxa) this.a).g();
                            if (responseCode >= 400) {
                                InputStream errorStream = ((oxa) this.a).q.getErrorStream();
                                Object obj4 = this.a;
                                if (errorStream != null) {
                                    readableByteChannel = owl.a(errorStream);
                                }
                                ((oxa) obj4).n = readableByteChannel;
                                ((oxa) this.a).b.b();
                                return;
                            }
                            oxa oxaVar4 = (oxa) this.a;
                            oxaVar4.n = owl.a(oxaVar4.q.getInputStream());
                            ((oxa) this.a).b.b();
                            return;
                        }
                        oxa oxaVar5 = (oxa) this.a;
                        oxaVar5.k(1, 2, new owt(oxaVar5, (String) list.get(0), 2));
                        return;
                    }
                }
            case 5:
                ((oxa) this.a).j.close();
                return;
            case 6:
                if (((oxa) this.a).g.get() == 8) {
                    return;
                }
                URL url = new URL(((oxa) this.a).m);
                HttpURLConnection httpURLConnection = ((oxa) this.a).q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    ((oxa) this.a).q = null;
                }
                ((oxa) this.a).q = (HttpURLConnection) url.openConnection();
                ((oxa) this.a).q.setInstanceFollowRedirects(false);
                if (!((oxa) this.a).e.containsKey("User-Agent")) {
                    oxa oxaVar6 = (oxa) this.a;
                    oxaVar6.e.put("User-Agent", oxaVar6.d);
                }
                for (Map.Entry entry : ((oxa) this.a).e.entrySet()) {
                    ((oxa) this.a).q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                oxa oxaVar7 = (oxa) this.a;
                if (oxaVar7.i == null) {
                    oxaVar7.i = "GET";
                }
                oxaVar7.q.setRequestMethod(oxaVar7.i);
                oxa oxaVar8 = (oxa) this.a;
                oxj oxjVar = oxaVar8.j;
                if (oxjVar != null) {
                    oxaVar8.r = new ows(oxaVar8, oxaVar8.k, oxaVar8.c, oxaVar8.q, oxjVar);
                    oxa oxaVar9 = (oxa) this.a;
                    ows owsVar4 = oxaVar9.r;
                    if (oxaVar9.f.size() != 1) {
                        z = false;
                    }
                    owsVar4.a(new owr(owsVar4, z, 0));
                    return;
                }
                oxaVar8.l = 10;
                ((oxa) this.a).q.connect();
                ((oxa) this.a).i();
                return;
            default:
                if (!((owy) this.a).d.g.compareAndSet(1, 4)) {
                    return;
                }
                owy owyVar3 = (owy) this.a;
                oxk oxkVar = owyVar3.a;
                oxa oxaVar10 = owyVar3.d;
                oxkVar.onResponseStarted(oxaVar10, oxaVar10.o);
                return;
        }
    }
}
