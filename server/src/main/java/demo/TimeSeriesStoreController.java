package demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 */
@RestController
@RequestMapping(value = "/api/timeseries", produces = "application/hal+json")
public class TimeSeriesStoreController {
    @RequestMapping(method = POST, produces = "application/hal+json")
    @ResponseStatus(OK)
    public void postTimeSeriesData(final HttpServletRequest request, @RequestBody final List<String> timeSeriesDtoList)
            throws Exception {
    }
}
