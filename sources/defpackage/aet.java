package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* renamed from: aet  reason: default package */
/* loaded from: classes.dex */
public final class aet {
    private static final byte[] C;
    private static final lct[] N;
    private static final lct[] O;
    private static final lct[] P;
    private static final lct[] Q;
    private static final lct[] R;
    private static final lct[] T;
    private static final lct[] U;
    private static final lct[] V;
    private static final lct[] W;
    static final Charset g;
    static final byte[] h;
    static final lct[][] j;
    private static SimpleDateFormat w;
    private static SimpleDateFormat x;
    private final FileDescriptor D;
    private final AssetManager.AssetInputStream E;
    private int F;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    public static final int[] a = {8, 8, 8};
    public static final int[] b = {8};
    static final byte[] c = {-1, -40, -1};
    private static final byte[] k = {102, 116, 121, 112};
    private static final byte[] l = {109, 105, 102, 49};
    private static final byte[] m = {104, 101, 105, 99};
    private static final byte[] n = {79, 76, 89, 77, 80, 0};
    private static final byte[] o = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] p = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] q = {101, 88, 73, 102};
    private static final byte[] r = {73, 72, 68, 82};
    private static final byte[] s = {73, 69, 78, 68};
    private static final byte[] t = {82, 73, 70, 70};
    private static final byte[] u = {87, 69, 66, 80};
    private static final byte[] v = {69, 88, 73, 70};
    static final String[] d = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] e = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] f = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final lct S = new lct("StripOffsets", 273, 3);
    private static final lct[] X = {new lct("SubIFDPointer", 330, 4), new lct("ExifIFDPointer", 34665, 4), new lct("GPSInfoIFDPointer", 34853, 4), new lct("InteroperabilityIFDPointer", 40965, 4), new lct("CameraSettingsIFDPointer", 8224, 1), new lct("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap[] y = new HashMap[10];
    private static final HashMap[] z = new HashMap[10];
    private static final HashSet A = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap B = new HashMap();
    private final HashMap[] G = new HashMap[10];
    private final Set H = new HashSet(10);
    public ByteOrder i = ByteOrder.BIG_ENDIAN;

    static {
        lct[] lctVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        lct[] lctVarArr2 = {new lct("NewSubfileType", 254, 4), new lct("SubfileType", 255, 4), new lct("ImageWidth", 256, 3, 4, null), new lct("ImageLength", 257, 3, 4, null), new lct("BitsPerSample", 258, 3), new lct("Compression", 259, 3), new lct("PhotometricInterpretation", 262, 3), new lct("ImageDescription", 270, 2), new lct("Make", 271, 2), new lct("Model", 272, 2), new lct("StripOffsets", 273, 3, 4, null), new lct("Orientation", 274, 3), new lct("SamplesPerPixel", 277, 3), new lct("RowsPerStrip", 278, 3, 4, null), new lct("StripByteCounts", 279, 3, 4, null), new lct("XResolution", 282, 5), new lct("YResolution", 283, 5), new lct("PlanarConfiguration", 284, 3), new lct("ResolutionUnit", 296, 3), new lct("TransferFunction", 301, 3), new lct("Software", 305, 2), new lct("DateTime", 306, 2), new lct("Artist", 315, 2), new lct("WhitePoint", 318, 5), new lct("PrimaryChromaticities", 319, 5), new lct("SubIFDPointer", 330, 4), new lct("JPEGInterchangeFormat", 513, 4), new lct("JPEGInterchangeFormatLength", 514, 4), new lct("YCbCrCoefficients", 529, 5), new lct("YCbCrSubSampling", 530, 3), new lct("YCbCrPositioning", 531, 3), new lct("ReferenceBlackWhite", 532, 5), new lct("Copyright", 33432, 2), new lct("ExifIFDPointer", 34665, 4), new lct("GPSInfoIFDPointer", 34853, 4), new lct("SensorTopBorder", 4, 4), new lct("SensorLeftBorder", 5, 4), new lct("SensorBottomBorder", 6, 4), new lct("SensorRightBorder", 7, 4), new lct("ISO", 23, 3), new lct("JpgFromRaw", 46, 7), new lct("Xmp", 700, 1)};
        N = lctVarArr2;
        lct[] lctVarArr3 = {new lct("ExposureTime", 33434, 5), new lct("FNumber", 33437, 5), new lct("ExposureProgram", 34850, 3), new lct("SpectralSensitivity", 34852, 2), new lct("PhotographicSensitivity", 34855, 3), new lct("OECF", 34856, 7), new lct("SensitivityType", 34864, 3), new lct("StandardOutputSensitivity", 34865, 4), new lct("RecommendedExposureIndex", 34866, 4), new lct("ISOSpeed", 34867, 4), new lct("ISOSpeedLatitudeyyy", 34868, 4), new lct("ISOSpeedLatitudezzz", 34869, 4), new lct("ExifVersion", 36864, 2), new lct("DateTimeOriginal", 36867, 2), new lct("DateTimeDigitized", 36868, 2), new lct("OffsetTime", 36880, 2), new lct("OffsetTimeOriginal", 36881, 2), new lct("OffsetTimeDigitized", 36882, 2), new lct("ComponentsConfiguration", 37121, 7), new lct("CompressedBitsPerPixel", 37122, 5), new lct("ShutterSpeedValue", 37377, 10), new lct("ApertureValue", 37378, 5), new lct("BrightnessValue", 37379, 10), new lct("ExposureBiasValue", 37380, 10), new lct("MaxApertureValue", 37381, 5), new lct("SubjectDistance", 37382, 5), new lct("MeteringMode", 37383, 3), new lct("LightSource", 37384, 3), new lct("Flash", 37385, 3), new lct("FocalLength", 37386, 5), new lct("SubjectArea", 37396, 3), new lct("MakerNote", 37500, 7), new lct("UserComment", 37510, 7), new lct("SubSecTime", 37520, 2), new lct("SubSecTimeOriginal", 37521, 2), new lct("SubSecTimeDigitized", 37522, 2), new lct("FlashpixVersion", 40960, 7), new lct("ColorSpace", 40961, 3), new lct("PixelXDimension", 40962, 3, 4, null), new lct("PixelYDimension", 40963, 3, 4, null), new lct("RelatedSoundFile", 40964, 2), new lct("InteroperabilityIFDPointer", 40965, 4), new lct("FlashEnergy", 41483, 5), new lct("SpatialFrequencyResponse", 41484, 7), new lct("FocalPlaneXResolution", 41486, 5), new lct("FocalPlaneYResolution", 41487, 5), new lct("FocalPlaneResolutionUnit", 41488, 3), new lct("SubjectLocation", 41492, 3), new lct("ExposureIndex", 41493, 5), new lct("SensingMethod", 41495, 3), new lct("FileSource", 41728, 7), new lct("SceneType", 41729, 7), new lct("CFAPattern", 41730, 7), new lct("CustomRendered", 41985, 3), new lct("ExposureMode", 41986, 3), new lct("WhiteBalance", 41987, 3), new lct("DigitalZoomRatio", 41988, 5), new lct("FocalLengthIn35mmFilm", 41989, 3), new lct("SceneCaptureType", 41990, 3), new lct("GainControl", 41991, 3), new lct("Contrast", 41992, 3), new lct("Saturation", 41993, 3), new lct("Sharpness", 41994, 3), new lct("DeviceSettingDescription", 41995, 7), new lct("SubjectDistanceRange", 41996, 3), new lct("ImageUniqueID", 42016, 2), new lct("CameraOwnerName", 42032, 2), new lct("BodySerialNumber", 42033, 2), new lct("LensSpecification", 42034, 5), new lct("LensMake", 42035, 2), new lct("LensModel", 42036, 2), new lct("Gamma", 42240, 5), new lct("DNGVersion", 50706, 1), new lct("DefaultCropSize", 50720, 3, 4, null)};
        O = lctVarArr3;
        lct[] lctVarArr4 = {new lct("GPSVersionID", 0, 1), new lct("GPSLatitudeRef", 1, 2), new lct("GPSLatitude", 2, 5, 10, null), new lct("GPSLongitudeRef", 3, 2), new lct("GPSLongitude", 4, 5, 10, null), new lct("GPSAltitudeRef", 5, 1), new lct("GPSAltitude", 6, 5), new lct("GPSTimeStamp", 7, 5), new lct("GPSSatellites", 8, 2), new lct("GPSStatus", 9, 2), new lct("GPSMeasureMode", 10, 2), new lct("GPSDOP", 11, 5), new lct("GPSSpeedRef", 12, 2), new lct("GPSSpeed", 13, 5), new lct("GPSTrackRef", 14, 2), new lct("GPSTrack", 15, 5), new lct("GPSImgDirectionRef", 16, 2), new lct("GPSImgDirection", 17, 5), new lct("GPSMapDatum", 18, 2), new lct("GPSDestLatitudeRef", 19, 2), new lct("GPSDestLatitude", 20, 5), new lct("GPSDestLongitudeRef", 21, 2), new lct("GPSDestLongitude", 22, 5), new lct("GPSDestBearingRef", 23, 2), new lct("GPSDestBearing", 24, 5), new lct("GPSDestDistanceRef", 25, 2), new lct("GPSDestDistance", 26, 5), new lct("GPSProcessingMethod", 27, 7), new lct("GPSAreaInformation", 28, 7), new lct("GPSDateStamp", 29, 2), new lct("GPSDifferential", 30, 3), new lct("GPSHPositioningError", 31, 5)};
        P = lctVarArr4;
        lct[] lctVarArr5 = {new lct("InteroperabilityIndex", 1, 2)};
        Q = lctVarArr5;
        lct[] lctVarArr6 = {new lct("NewSubfileType", 254, 4), new lct("SubfileType", 255, 4), new lct("ThumbnailImageWidth", 256, 3, 4, null), new lct("ThumbnailImageLength", 257, 3, 4, null), new lct("BitsPerSample", 258, 3), new lct("Compression", 259, 3), new lct("PhotometricInterpretation", 262, 3), new lct("ImageDescription", 270, 2), new lct("Make", 271, 2), new lct("Model", 272, 2), new lct("StripOffsets", 273, 3, 4, null), new lct("ThumbnailOrientation", 274, 3), new lct("SamplesPerPixel", 277, 3), new lct("RowsPerStrip", 278, 3, 4, null), new lct("StripByteCounts", 279, 3, 4, null), new lct("XResolution", 282, 5), new lct("YResolution", 283, 5), new lct("PlanarConfiguration", 284, 3), new lct("ResolutionUnit", 296, 3), new lct("TransferFunction", 301, 3), new lct("Software", 305, 2), new lct("DateTime", 306, 2), new lct("Artist", 315, 2), new lct("WhitePoint", 318, 5), new lct("PrimaryChromaticities", 319, 5), new lct("SubIFDPointer", 330, 4), new lct("JPEGInterchangeFormat", 513, 4), new lct("JPEGInterchangeFormatLength", 514, 4), new lct("YCbCrCoefficients", 529, 5), new lct("YCbCrSubSampling", 530, 3), new lct("YCbCrPositioning", 531, 3), new lct("ReferenceBlackWhite", 532, 5), new lct("Xmp", 700, 1), new lct("Copyright", 33432, 2), new lct("ExifIFDPointer", 34665, 4), new lct("GPSInfoIFDPointer", 34853, 4), new lct("DNGVersion", 50706, 1), new lct("DefaultCropSize", 50720, 3, 4, null)};
        R = lctVarArr6;
        lct[] lctVarArr7 = {new lct("ThumbnailImage", 256, 7), new lct("CameraSettingsIFDPointer", 8224, 4), new lct("ImageProcessingIFDPointer", 8256, 4)};
        T = lctVarArr7;
        lct[] lctVarArr8 = {new lct("PreviewImageStart", 257, 4), new lct("PreviewImageLength", 258, 4)};
        U = lctVarArr8;
        lct[] lctVarArr9 = {new lct("AspectFrame", 4371, 3)};
        V = lctVarArr9;
        lct[] lctVarArr10 = {new lct("ColorSpace", 55, 3)};
        W = lctVarArr10;
        j = new lct[][]{lctVarArr2, lctVarArr3, lctVarArr4, lctVarArr5, lctVarArr6, lctVarArr2, lctVarArr7, lctVarArr8, lctVarArr9, lctVarArr10};
        Charset forName = Charset.forName("US-ASCII");
        g = forName;
        h = "Exif\u0000\u0000".getBytes(forName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            lct[][] lctVarArr11 = j;
            int length = lctVarArr11.length;
            if (i >= 10) {
                HashMap hashMap = B;
                lct[] lctVarArr12 = X;
                hashMap.put(Integer.valueOf(lctVarArr12[0].b), 5);
                hashMap.put(Integer.valueOf(lctVarArr12[1].b), 1);
                hashMap.put(Integer.valueOf(lctVarArr12[2].b), 2);
                hashMap.put(Integer.valueOf(lctVarArr12[3].b), 3);
                hashMap.put(Integer.valueOf(lctVarArr12[4].b), 7);
                hashMap.put(Integer.valueOf(lctVarArr12[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            y[i] = new HashMap();
            z[i] = new HashMap();
            for (lct lctVar : lctVarArr11[i]) {
                y[i].put(Integer.valueOf(lctVar.b), lctVar);
                z[i].put(lctVar.d, lctVar);
            }
            i++;
        }
    }

    public aet(InputStream inputStream) {
        int length = j.length;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    aeu.a(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.E = null;
                    this.D = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.E = null;
            this.D = null;
        }
        i(inputStream);
    }

    private final void c() {
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.G[0].put("DateTime", aer.b(b2));
        }
        if (b("ImageWidth") == null) {
            this.G[0].put("ImageWidth", aer.c(0L, this.i));
        }
        if (b("ImageLength") == null) {
            this.G[0].put("ImageLength", aer.c(0L, this.i));
        }
        if (b("Orientation") == null) {
            this.G[0].put("Orientation", aer.c(0L, this.i));
        }
        if (b("LightSource") == null) {
            this.G[1].put("LightSource", aer.c(0L, this.i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0113, code lost:
        r20.c = r19.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[LOOP:0: B:6:0x001c->B:23:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(defpackage.aeq r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aet.d(aeq, int, int):void");
    }

    private final void e(aeq aeqVar) {
        aeqVar.c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = p;
        int length = bArr.length;
        aeqVar.b(8);
        int length2 = bArr.length;
        int i = 8;
        while (true) {
            try {
                int readInt = aeqVar.readInt();
                byte[] bArr2 = new byte[4];
                aeqVar.readFully(bArr2);
                int i2 = i + 8;
                if (i2 == 16) {
                    if (!Arrays.equals(bArr2, r)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    i2 = 16;
                }
                if (Arrays.equals(bArr2, s)) {
                    return;
                }
                if (!Arrays.equals(bArr2, q)) {
                    int i3 = readInt + 4;
                    aeqVar.b(i3);
                    i = i2 + i3;
                } else {
                    byte[] bArr3 = new byte[readInt];
                    aeqVar.readFully(bArr3);
                    int readInt2 = aeqVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) != readInt2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    this.J = i2;
                    k(bArr3, 0);
                    o();
                    m(new aeq(bArr3));
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void f(aeq aeqVar) {
        aeqVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        aeqVar.b(4);
        int readInt = aeqVar.readInt() + 8;
        byte[] bArr = u;
        int length2 = bArr.length;
        aeqVar.b(4);
        int length3 = bArr.length;
        int i = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                aeqVar.readFully(bArr2);
                int readInt2 = aeqVar.readInt();
                int i2 = i + 8;
                if (Arrays.equals(v, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    aeqVar.readFully(bArr3);
                    this.J = i2;
                    k(bArr3, 0);
                    m(new aeq(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i = i2 + readInt2;
                if (i == readInt) {
                    return;
                }
                if (i <= readInt) {
                    aeqVar.b(readInt2);
                } else {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private final void g(aeq aeqVar, HashMap hashMap) {
        aer aerVar = (aer) hashMap.get("JPEGInterchangeFormat");
        aer aerVar2 = (aer) hashMap.get("JPEGInterchangeFormatLength");
        if (aerVar == null || aerVar2 == null) {
            return;
        }
        int a2 = aerVar.a(this.i);
        int a3 = aerVar2.a(this.i);
        if (this.F == 7) {
            a2 += this.K;
        }
        if (a2 <= 0 || a3 <= 0 || this.E != null || this.D != null) {
            return;
        }
        aeqVar.b(a2);
        aeqVar.readFully(new byte[a3]);
    }

    private final void h(aeq aeqVar, HashMap hashMap) {
        int length;
        int length2;
        aer aerVar = (aer) hashMap.get("StripOffsets");
        aer aerVar2 = (aer) hashMap.get("StripByteCounts");
        if (aerVar == null || aerVar2 == null) {
            return;
        }
        long[] c2 = va.c(aerVar.f(this.i));
        long[] c3 = va.c(aerVar2.f(this.i));
        if (c2 == null || (length = c2.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        } else if (c3 == null || (length2 = c3.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        } else if (length == length2) {
            long j2 = 0;
            for (long j3 : c3) {
                j2 += j3;
            }
            byte[] bArr = new byte[(int) j2];
            this.I = true;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int length3 = c2.length;
                if (i >= length3) {
                    if (!this.I) {
                        return;
                    }
                    long j4 = c2[0];
                    return;
                }
                int i4 = (int) c2[i];
                int i5 = (int) c3[i];
                if (i < length3 - 1 && i4 + i5 != c2[i + 1]) {
                    this.I = false;
                }
                int i6 = i4 - i2;
                if (i6 < 0) {
                    return;
                }
                try {
                    aeqVar.b(i6);
                    int i7 = i2 + i6;
                    byte[] bArr2 = new byte[i5];
                    aeqVar.readFully(bArr2);
                    i2 = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i3, i5);
                    i3 += i5;
                    i++;
                } catch (EOFException unused) {
                    return;
                }
            }
        } else {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b7 A[Catch: all -> 0x0459, IOException | UnsupportedOperationException -> 0x045e, TryCatch #12 {IOException | UnsupportedOperationException -> 0x045e, all -> 0x0459, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0043, B:14:0x0049, B:15:0x0054, B:17:0x0057, B:21:0x005d, B:24:0x0117, B:30:0x0128, B:32:0x0134, B:38:0x013a, B:77:0x0259, B:80:0x03a3, B:91:0x0268, B:92:0x026b, B:34:0x026c, B:35:0x0273, B:97:0x0277, B:99:0x0288, B:101:0x02b0, B:102:0x02c1, B:105:0x02e1, B:106:0x02f3, B:108:0x0301, B:110:0x030b, B:113:0x030f, B:115:0x0317, B:117:0x031e, B:119:0x0326, B:120:0x032a, B:121:0x0346, B:122:0x02b6, B:124:0x02bc, B:127:0x035e, B:129:0x0370, B:130:0x037d, B:133:0x0398, B:134:0x03a0, B:135:0x03ae, B:137:0x03b7, B:139:0x03bf, B:141:0x03c6, B:143:0x0417, B:147:0x0425, B:145:0x0449, B:150:0x0452, B:160:0x0084, B:168:0x00b0, B:172:0x00cf, B:174:0x00d4, B:179:0x00db, B:181:0x00e0, B:183:0x00e8, B:188:0x00ec, B:190:0x00f1, B:192:0x00fd, B:176:0x0103, B:206:0x00c3, B:207:0x00c6, B:202:0x00cb, B:218:0x0094, B:219:0x0097, B:214:0x009c, B:19:0x0109, B:12:0x0110), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d4 A[Catch: all -> 0x0459, IOException | UnsupportedOperationException -> 0x045e, TryCatch #12 {IOException | UnsupportedOperationException -> 0x045e, all -> 0x0459, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0043, B:14:0x0049, B:15:0x0054, B:17:0x0057, B:21:0x005d, B:24:0x0117, B:30:0x0128, B:32:0x0134, B:38:0x013a, B:77:0x0259, B:80:0x03a3, B:91:0x0268, B:92:0x026b, B:34:0x026c, B:35:0x0273, B:97:0x0277, B:99:0x0288, B:101:0x02b0, B:102:0x02c1, B:105:0x02e1, B:106:0x02f3, B:108:0x0301, B:110:0x030b, B:113:0x030f, B:115:0x0317, B:117:0x031e, B:119:0x0326, B:120:0x032a, B:121:0x0346, B:122:0x02b6, B:124:0x02bc, B:127:0x035e, B:129:0x0370, B:130:0x037d, B:133:0x0398, B:134:0x03a0, B:135:0x03ae, B:137:0x03b7, B:139:0x03bf, B:141:0x03c6, B:143:0x0417, B:147:0x0425, B:145:0x0449, B:150:0x0452, B:160:0x0084, B:168:0x00b0, B:172:0x00cf, B:174:0x00d4, B:179:0x00db, B:181:0x00e0, B:183:0x00e8, B:188:0x00ec, B:190:0x00f1, B:192:0x00fd, B:176:0x0103, B:206:0x00c3, B:207:0x00c6, B:202:0x00cb, B:218:0x0094, B:219:0x0097, B:214:0x009c, B:19:0x0109, B:12:0x0110), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v33, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.media.MediaMetadataRetriever] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(java.io.InputStream r18) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aet.i(java.io.InputStream):void");
    }

    private final void j(aeq aeqVar) {
        ByteOrder u2 = u(aeqVar);
        this.i = u2;
        aeqVar.c = u2;
        int readUnsignedShort = aeqVar.readUnsignedShort();
        int i = this.F;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = aeqVar.readInt();
            if (readInt < 8) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i2 = readInt - 8;
            if (i2 <= 0) {
                return;
            }
            aeqVar.b(i2);
            return;
        }
        throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
    }

    private final void k(byte[] bArr, int i) {
        aeq aeqVar = new aeq(bArr, (byte[]) null);
        j(aeqVar);
        r(aeqVar, i);
    }

    private final void l(int i, String str, String str2) {
        if (this.G[i].isEmpty() || this.G[i].get(str) == null) {
            return;
        }
        HashMap hashMap = this.G[i];
        hashMap.put(str2, (aer) hashMap.get(str));
        this.G[i].remove(str);
    }

    private final void m(aeq aeqVar) {
        aer aerVar;
        HashMap hashMap = this.G[4];
        aer aerVar2 = (aer) hashMap.get("Compression");
        if (aerVar2 != null) {
            int a2 = aerVar2.a(this.i);
            if (a2 != 1) {
                if (a2 == 6) {
                    g(aeqVar, hashMap);
                    return;
                } else if (a2 != 7) {
                    return;
                }
            }
            aer aerVar3 = (aer) hashMap.get("BitsPerSample");
            if (aerVar3 == null) {
                return;
            }
            int[] iArr = (int[]) aerVar3.f(this.i);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.F != 3 || (aerVar = (aer) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int a3 = aerVar.a(this.i);
                if (a3 != 1) {
                    if (a3 != 6 || !Arrays.equals(iArr, iArr2)) {
                        return;
                    }
                } else if (!Arrays.equals(iArr, b)) {
                    return;
                }
            }
            h(aeqVar, hashMap);
            return;
        }
        g(aeqVar, hashMap);
    }

    private final void n(int i, int i2) {
        if (this.G[i].isEmpty() || this.G[i2].isEmpty()) {
            return;
        }
        aer aerVar = (aer) this.G[i].get("ImageLength");
        aer aerVar2 = (aer) this.G[i].get("ImageWidth");
        aer aerVar3 = (aer) this.G[i2].get("ImageLength");
        aer aerVar4 = (aer) this.G[i2].get("ImageWidth");
        if (aerVar == null || aerVar2 == null || aerVar3 == null || aerVar4 == null) {
            return;
        }
        int a2 = aerVar.a(this.i);
        int a3 = aerVar2.a(this.i);
        int a4 = aerVar3.a(this.i);
        int a5 = aerVar4.a(this.i);
        if (a2 >= a4 || a3 >= a5) {
            return;
        }
        HashMap[] hashMapArr = this.G;
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    private final void o() {
        n(0, 5);
        n(0, 4);
        n(5, 4);
        aer aerVar = (aer) this.G[1].get("PixelXDimension");
        aer aerVar2 = (aer) this.G[1].get("PixelYDimension");
        if (aerVar != null && aerVar2 != null) {
            this.G[0].put("ImageWidth", aerVar);
            this.G[0].put("ImageLength", aerVar2);
        }
        if (this.G[4].isEmpty() && p(this.G[5])) {
            HashMap[] hashMapArr = this.G;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        p(this.G[4]);
        l(0, "ThumbnailOrientation", "Orientation");
        l(0, "ThumbnailImageLength", "ImageLength");
        l(0, "ThumbnailImageWidth", "ImageWidth");
        l(5, "ThumbnailOrientation", "Orientation");
        l(5, "ThumbnailImageLength", "ImageLength");
        l(5, "ThumbnailImageWidth", "ImageWidth");
        l(4, "Orientation", "ThumbnailOrientation");
        l(4, "ImageLength", "ThumbnailImageLength");
        l(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean p(HashMap hashMap) {
        aer aerVar = (aer) hashMap.get("ImageLength");
        aer aerVar2 = (aer) hashMap.get("ImageWidth");
        if (aerVar == null || aerVar2 == null) {
            return false;
        }
        return aerVar.a(this.i) <= 512 && aerVar2.a(this.i) <= 512;
    }

    private final void q(aeq aeqVar) {
        aer aerVar;
        j(aeqVar);
        r(aeqVar, 0);
        s(aeqVar, 0);
        s(aeqVar, 5);
        s(aeqVar, 4);
        o();
        if (this.F != 8 || (aerVar = (aer) this.G[1].get("MakerNote")) == null) {
            return;
        }
        aeq aeqVar2 = new aeq(aerVar.d, (byte[]) null);
        aeqVar2.c = this.i;
        aeqVar2.b(6);
        r(aeqVar2, 9);
        aer aerVar2 = (aer) this.G[9].get("ColorSpace");
        if (aerVar2 == null) {
            return;
        }
        this.G[1].put("ColorSpace", aerVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0065, code lost:
        if (r7 != 9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0069, code lost:
        if (r10 != 8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x005f, code lost:
        if (r10 != 3) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(defpackage.aeq r24, int r25) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aet.r(aeq, int):void");
    }

    private final void s(aeq aeqVar, int i) {
        aer e2;
        aer e3;
        aer aerVar = (aer) this.G[i].get("DefaultCropSize");
        aer aerVar2 = (aer) this.G[i].get("SensorTopBorder");
        aer aerVar3 = (aer) this.G[i].get("SensorLeftBorder");
        aer aerVar4 = (aer) this.G[i].get("SensorBottomBorder");
        aer aerVar5 = (aer) this.G[i].get("SensorRightBorder");
        if (aerVar != null) {
            if (aerVar.a == 5) {
                aes[] aesVarArr = (aes[]) aerVar.f(this.i);
                if (aesVarArr == null || aesVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(aesVarArr))));
                    return;
                } else {
                    e2 = aer.d(aesVarArr[0], this.i);
                    e3 = aer.d(aesVarArr[1], this.i);
                }
            } else {
                int[] iArr = (int[]) aerVar.f(this.i);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    e2 = aer.e(iArr[0], this.i);
                    e3 = aer.e(iArr[1], this.i);
                }
            }
            this.G[i].put("ImageWidth", e2);
            this.G[i].put("ImageLength", e3);
        } else if (aerVar2 == null || aerVar3 == null || aerVar4 == null || aerVar5 == null) {
            aer aerVar6 = (aer) this.G[i].get("ImageLength");
            aer aerVar7 = (aer) this.G[i].get("ImageWidth");
            if (aerVar6 != null && aerVar7 != null) {
                return;
            }
            aer aerVar8 = (aer) this.G[i].get("JPEGInterchangeFormat");
            aer aerVar9 = (aer) this.G[i].get("JPEGInterchangeFormatLength");
            if (aerVar8 == null || aerVar9 == null) {
                return;
            }
            int a2 = aerVar8.a(this.i);
            int a3 = aerVar8.a(this.i);
            aeqVar.c(a2);
            byte[] bArr = new byte[a3];
            aeqVar.readFully(bArr);
            d(new aeq(bArr), a2, i);
        } else {
            int a4 = aerVar2.a(this.i);
            int a5 = aerVar4.a(this.i);
            int a6 = aerVar5.a(this.i);
            int a7 = aerVar3.a(this.i);
            if (a5 <= a4 || a6 <= a7) {
                return;
            }
            aer e4 = aer.e(a5 - a4, this.i);
            aer e5 = aer.e(a6 - a7, this.i);
            this.G[i].put("ImageLength", e4);
            this.G[i].put("ImageWidth", e5);
        }
    }

    private static final boolean t(byte[] bArr) {
        aeq aeqVar;
        long readInt;
        byte[] bArr2;
        long j2;
        aeq aeqVar2 = null;
        try {
            aeqVar = new aeq(bArr);
            try {
                readInt = aeqVar.readInt();
                bArr2 = new byte[4];
                aeqVar.readFully(bArr2);
            } catch (Exception unused) {
                aeqVar2 = aeqVar;
                if (aeqVar2 != null) {
                    aeqVar2.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                aeqVar2 = aeqVar;
                if (aeqVar2 != null) {
                    aeqVar2.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!Arrays.equals(bArr2, k)) {
            aeqVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = aeqVar.readLong();
            j2 = 16;
            if (readInt < 16) {
                aeqVar.close();
                return false;
            }
        } else {
            j2 = 8;
        }
        if (readInt > 5000) {
            readInt = 5000;
        }
        long j3 = readInt - j2;
        if (j3 < 8) {
            aeqVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        for (long j4 = 0; j4 < (j3 >> 2); j4++) {
            try {
                aeqVar.readFully(bArr3);
                if (j4 != 1) {
                    if (Arrays.equals(bArr3, l)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, m)) {
                        z2 = true;
                    }
                    if (z3 && z2) {
                        aeqVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused3) {
                aeqVar.close();
                return false;
            }
        }
        aeqVar.close();
        return false;
    }

    private static final ByteOrder u(aeq aeqVar) {
        short readShort = aeqVar.readShort();
        if (readShort != 18761) {
            if (readShort != 19789) {
                throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
            }
            return ByteOrder.BIG_ENDIAN;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final aer a(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            int length = j.length;
            if (i < 10) {
                aer aerVar = (aer) this.G[i].get(str);
                if (aerVar != null) {
                    return aerVar;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final String b(String str) {
        double d2;
        aer a2 = a(str);
        if (a2 != null) {
            if (!A.contains(str)) {
                return a2.g(this.i);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = a2.a;
                if (i == 5 || i == 10) {
                    aes[] aesVarArr = (aes[]) a2.f(this.i);
                    if (aesVarArr == null || aesVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(aesVarArr))));
                        return null;
                    }
                    aes aesVar = aesVarArr[0];
                    aes aesVar2 = aesVarArr[1];
                    aes aesVar3 = aesVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) aesVar.a) / ((float) aesVar.b))), Integer.valueOf((int) (((float) aesVar2.a) / ((float) aesVar2.b))), Integer.valueOf((int) (((float) aesVar3.a) / ((float) aesVar3.b))));
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + a2.a);
                return null;
            }
            try {
                Object f2 = a2.f(this.i);
                if (f2 == null) {
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                if (f2 instanceof String) {
                    d2 = Double.parseDouble((String) f2);
                } else if (f2 instanceof long[]) {
                    long[] jArr = (long[]) f2;
                    if (jArr.length == 1) {
                        d2 = jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof int[]) {
                    int[] iArr = (int[]) f2;
                    if (iArr.length == 1) {
                        d2 = iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof double[]) {
                    double[] dArr = (double[]) f2;
                    if (dArr.length == 1) {
                        d2 = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof aes[]) {
                    aes[] aesVarArr2 = (aes[]) f2;
                    if (aesVarArr2.length == 1) {
                        aes aesVar4 = aesVarArr2[0];
                        double d3 = aesVar4.a;
                        double d4 = aesVar4.b;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        d2 = d3 / d4;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
