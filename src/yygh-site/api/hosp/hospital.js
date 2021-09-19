import request from '@/utils/request'

const api_name = `/api/hosp/hospital`

export default {
  getPageList(page, limit, searchObj) {
    return request({
      url: `${api_name}/findHospList/${page}/${limit}`,
      method: 'get',
      params: searchObj
    })
  },

  getByHosname(hosname) {
    return request({
      url: `${api_name}/findByHosname/${hosname}`,
      method: 'get'
    })
  },
  //根据医院编号查询医院信息
  show(hoscode) {
    return request({
      url: `${api_name}/findHospDetail/${hoscode}`,
      method: 'get'
    })
  },
  //根据医院编号查询科室信息
  findDepartment(hoscode) {
    return request({
      url: `${api_name}/department/${hoscode}`,
      method: 'get'
    })
  },
  //获取可预约排班信息分页
  getBookingScheduleRule(page, limit, hoscode, depcode) {
    return request({
      url: `${api_name}/auth/getBookingScheduleRule/${page}/${limit}/${hoscode}/${depcode}`,
      method: 'get'
    })
  },
  //根据排班日期获取排班信息
  findScheduleList(hoscode, depcode, workDate) {
    return request({
      url: `${api_name}/auth/findScheduleList/${hoscode}/${depcode}/${workDate}`,
      method: 'get'
    })
  },
  //根据排班id获取排班信息
  getSchedule(id) {
    return request({
      url: `${api_name}/getSchedule/${id}`,
      method: 'get'
    })
  }

  // getHospitalInfo(hoscode) {
  //   return request({
  //     url: `${api_name}/getHospitalInfo/${hoscode}`,
  //     method: 'get'
  //   })
  // },
  //
  // getBookingScheduleRule(page, limit, hoscode, depcode) {
  //   return request({
  //     url: `${api_name}/auth/getBookingScheduleRule/${page}/${limit}/${hoscode}/${depcode}`,
  //     method: 'get'
  //   })
  // },
  //
  // findScheduleList(hoscode, depcode, workDate) {
  //   return request({
  //     url: `${api_name}/auth/findScheduleList/${hoscode}/${depcode}/${workDate}`,
  //     method: 'get'
  //   })
  // },
  //

}
